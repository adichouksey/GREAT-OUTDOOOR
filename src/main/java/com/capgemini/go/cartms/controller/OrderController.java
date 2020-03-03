package com.capgemini.go.cartms.controller;

import java.util.Date;
import java.util.Map;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.service.OrderAndCartService;
import com.capgemini.go.cartms.service.OrderAndCartServiceImpl;
import com.capgemini.go.cartms.util.CartUtil;
import com.capgemini.go.cartms.util.OrderUtil;

public class OrderController {

	private OrderAndCartService orderAndCartService;

	public void setOrderAndCartService(OrderAndCartService orderAndCartService) {
		this.orderAndCartService = orderAndCartService;
	}

	public OrderController(OrderAndCartService orderAndCartService) {
		this.orderAndCartService = orderAndCartService;
	}

	public OrderController() {

	}

	public OrderAndCartService getOrderAndCartService() {
		return orderAndCartService;
	}

	public String addItemToCart(Map<String, Object> obj) {
		Cart cart = new Cart();
		cart.setProductId((String) obj.get("productId"));
		cart.setUserID((String) obj.get("userId"));
		cart.setQuantity((Integer) obj.get("quantity"));
		CartDTO cartDTO = CartUtil.convertToCartDTO(cart);
		boolean status = orderAndCartService.addItemToCart(cartDTO);
		if (status) {
			return "Item Added to Cart";
		} else {
			return "Error occured while adding item to cart";
		}

	}

	public String placeOrder(Map<String, Object> obj) {
		Order order = new Order();
		order.setUserId((String) obj.get("userId"));
		order.setOrderID((String) obj.get("orderId"));
		order.setAddressID((String) obj.get("addressID"));
		order.setOrderDispatchDate((Date) obj.get("orderDispatchDate"));
		order.setOrderInitiateDate((Date) obj.get("orderIntiateTime"));
		OrderDTO orderDTO = OrderUtil.convertToOrderDTO(order);
		boolean status = orderAndCartService.registerOrder(orderDTO);
		if (status) {
			return "order Place sucessfully";
		} else {
			return "Error occured while placing order";
		}

	}

}
