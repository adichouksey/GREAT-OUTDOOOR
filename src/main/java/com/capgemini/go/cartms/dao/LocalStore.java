package com.capgemini.go.cartms.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.entities.OrderProductMap;
import com.capgemini.go.cartms.entities.ProductUINMap;

public class LocalStore {	
	
	public static Map<String, Cart> cartMap = new HashMap<String, Cart>();
	
	public static Map<String, Order> orderMap = new HashMap<String, Order>();
	
	public static Map<String, ProductUINMap>  productUINMap = new HashMap<String, ProductUINMap>();
	
	public static Map<String, OrderProductMap>  orderProMap = new HashMap<String, OrderProductMap>();

}
