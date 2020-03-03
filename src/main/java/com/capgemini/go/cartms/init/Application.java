package com.capgemini.go.cartms.init;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.go.cartms.controller.OrderController;
import com.capgemini.go.cartms.dao.LocalStore;
import com.capgemini.go.cartms.dao.OrderAndCartDAO;
import com.capgemini.go.cartms.dao.OrderAndCartDaoImpl;
import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.service.OrderAndCartService;
import com.capgemini.go.cartms.service.OrderAndCartServiceImpl;

public class Application {

	public static void main(String[] args) {
		Cart cart1 = new Cart("user1", "uin1", 2);
		Cart cart2 = new Cart("user1", "uin1", 2);
			
		

		Map<String, Object> cartDetail = new HashMap<String, Object>();
		cartDetail.put("userId", "8");
		cartDetail.put("productId", "9");
		cartDetail.put("quantity", 8);

		Map<String, Object> cartDetail1 = new HashMap<String, Object>();
		cartDetail1.put("userId", "10");
		cartDetail1.put("productId", "9");
		cartDetail1.put("quantity", 8);
		

		Map<String, Object> orderDetail = new HashMap<String, Object>();
		orderDetail.put("userId", "Ritu");
		orderDetail.put("orderId", "PumaShoe");
		orderDetail.put("addressID", "BHOPAL");
		orderDetail.put("orderDispatchDate", new Date());
		orderDetail.put("orderIntiateTime", new Date());

		OrderAndCartDAO orderAndCartDao = new OrderAndCartDaoImpl();
		OrderAndCartService orderAndCartService = new OrderAndCartServiceImpl(orderAndCartDao);

		OrderController orderController = new OrderController();
		orderController.setOrderAndCartService(orderAndCartService);
		String returnObject = orderController.addItemToCart(cartDetail);
		
		System.out.println(orderController.addItemToCart(cartDetail1));
//		System.out.println(orderController.addItemToCart(cartDetail1));
//		orderController.addItemToCart(cartDetail1);

		orderController.placeOrder(orderDetail);
//		orderController.placeOrder(orderDetail);

		System.out.println("status of add item to cart ---" + returnObject);
		System.out.println(LocalStore.cartMap.toString());

		System.out.println(LocalStore.orderMap.toString());

	}

}
