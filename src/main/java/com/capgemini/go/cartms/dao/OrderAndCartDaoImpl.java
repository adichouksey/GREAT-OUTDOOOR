package com.capgemini.go.cartms.dao;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.dto.ProductUINMapDTO;
import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.entities.OrderProductMap;
import com.capgemini.go.cartms.entities.ProductUINMap;
import com.capgemini.go.cartms.exceptions.CartException;
import com.capgemini.go.cartms.exceptions.InValidException;
import com.capgemini.go.cartms.exceptions.OrderException;
import com.capgemini.go.cartms.exceptions.OrderProductMapException;
import com.capgemini.go.cartms.exceptions.ProductUNIMapException;
import com.capgemini.go.cartms.util.CartUtil;
import com.capgemini.go.cartms.util.OrderProductMapUtil;
import com.capgemini.go.cartms.util.OrderUtil;
import com.capgemini.go.cartms.util.ProductUNIMapUtil;

public class OrderAndCartDaoImpl implements OrderAndCartDAO {

	public boolean addItemToCart(CartDTO cartDTO) {
        // for getting unique cart product for each user --> productId + " "+ userId
		if (LocalStore.cartMap.containsKey(cartDTO.getProductId() +" "+ cartDTO.getUserID())) {
			throw new CartException(" Product Is already in cart with user");
//			System.out.print("already exist");
		} else {
			Cart cart = CartUtil.convertToCart(cartDTO);
			LocalStore.cartMap.put(cartDTO.getProductId() +" "+ cartDTO.getUserID(), cart);
		}
		return true;
	}

	public boolean deleteOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO) {
		OrderProductMap orderProductMap = LocalStore.orderProMap
				.get(orderProductMapDTO.getProductId() + orderProductMapDTO.getOrderId());
		if (orderProductMap == null) {
			throw new InValidException("Order product Map does not exist");
		} else {
			LocalStore.cartMap.remove(orderProductMap.getProductId() +" "+ orderProductMap.getOrderId());
		}
		return true;
	}

	public boolean insertOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO) {

		if (LocalStore.orderProMap.containsKey(orderProductMapDTO.getProductId() +" "+ orderProductMapDTO.getOrderId())) {
			throw new OrderProductMapException(" Product Is already in Order product ");
		} else {
			OrderProductMap orderProductMap = OrderProductMapUtil.convertToOrderProductMap(orderProductMapDTO);
			LocalStore.orderProMap.put(orderProductMapDTO.getProductId() + " "+ orderProductMapDTO.getOrderId(),
					orderProductMap);
		}
		return true;
	}

	public boolean registerOrder(OrderDTO orderDTO) {

		if (LocalStore.orderMap.containsKey(orderDTO.getOrderID())) {
			throw new OrderException(" Product Is already in cart with user");
		} else {

			Order order = OrderUtil.convertToOrder(orderDTO);
			LocalStore.orderMap.put(orderDTO.getOrderID(), order);
		}

		return true;
	}

	public boolean removeItemFromCart(CartDTO cartDTO) {

		Cart cart = LocalStore.cartMap.get(cartDTO.getProductId() +" "+ cartDTO.getUserID());
		if (cart == null) {
			throw new InValidException("Cart item does not exist");
		} else {
			LocalStore.cartMap.remove(cartDTO.getProductId() +" "+ cartDTO.getUserID());
		}
		return true;
	}

	public boolean updateItemQuantity(CartDTO cartDTO) {
		Cart cart = LocalStore.cartMap.get(cartDTO.getProductId() +" "+ cartDTO.getUserID());
		if (cart == null) {
			throw new InValidException("Cart item does not exist");
		} else {
			cart = CartUtil.convertToCart(cartDTO);
			LocalStore.cartMap.put(cartDTO.getProductId() + " "+ cartDTO.getUserID(), cart);
		}
		return true;
	}

	public boolean updateProductUinMap(ProductUINMapDTO productUINMapDTO) {
		ProductUINMap productUINMap = LocalStore.productUINMap.get(productUINMapDTO.getProductUIN());
		if (productUINMap == null) {
			throw new ProductUNIMapException("ProductUNIMap does not exist");
		} else {
			productUINMap = ProductUNIMapUtil.convertToProductUNIMap(productUINMapDTO);
			LocalStore.productUINMap.put(productUINMapDTO.getProductUIN(), productUINMap);
		}
		return true;
	}

}
