package com.capgemini.go.cartms.service;

import java.util.Map;

import com.capgemini.go.cartms.dao.OrderAndCartDAO;
import com.capgemini.go.cartms.dao.OrderAndCartDaoImpl;
import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.dto.ProductUINMapDTO;
import com.capgemini.go.cartms.entities.OrderProductMap;
import com.capgemini.go.cartms.entities.ProductUINMap;

public class OrderAndCartServiceImpl implements OrderAndCartService{
	
	
	private OrderAndCartDAO orderAndCartDAO;

	public OrderAndCartServiceImpl(OrderAndCartDAO orderAndCartDAO) {
		this.orderAndCartDAO = orderAndCartDAO;
	}

	public OrderAndCartDAO getOrderAndCartDAO() {
		return orderAndCartDAO;
	}

	public void setOrderAndCartDAO(OrderAndCartDAO orderAndCartDAO) {
		this.orderAndCartDAO = orderAndCartDAO;
	}

	public boolean addItemToCart(CartDTO cartDTO) {
		
		return orderAndCartDAO.addItemToCart(cartDTO);
	}



	public boolean registerOrder(OrderDTO orderDTO) {
		orderAndCartDAO.registerOrder(orderDTO);
		return true;
	}

	public boolean removeItemFromCart(CartDTO cartDTO) {
		orderAndCartDAO.removeItemFromCart(cartDTO);
		return true;
	}

	public boolean updateItemQuantity(CartDTO cartDTO) {
		orderAndCartDAO.updateItemQuantity(cartDTO);
		return true;
	}

	public boolean deleteOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO) {
		orderAndCartDAO.deleteOrderProductMapEntity(orderProductMapDTO);
		return true;
	}

	public boolean insertOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO) {
		orderAndCartDAO.insertOrderProductMapEntity(orderProductMapDTO);
		return true;
	}

	public boolean updateProductUinMap(ProductUINMapDTO productUINMapDTO) {
		orderAndCartDAO.updateProductUinMap(productUINMapDTO);
		return true;
	}

	
	  
	  

}
