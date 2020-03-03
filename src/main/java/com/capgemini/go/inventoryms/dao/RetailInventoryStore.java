package com.capgemini.go.inventoryms.dao;

import java.util.*;

import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;

public  class RetailInventoryStore {
	/**
	 * key is id of RetailerInventoryBean, value is RetailerInventoryBean
	 */
	public static Map<String,RetailerInventoryBean> inventoryStore = new HashMap();
	
	
}
