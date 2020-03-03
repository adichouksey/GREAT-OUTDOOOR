package com.capgemini.go.inventoryms.util;
import java.util.*;
import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;
import com.capgemini.go.productmanagement.dao.ProductStore;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.inventoryms.dao.RetailInventoryStore;
import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;

public class InventoryUtil {
	
	public static RetailerInventoryBean convert(RetailerInventoryDTO dto) {
		Map<String,RetailerInventoryBean> store=RetailInventoryStore.inventoryStore;
		RetailerInventoryBean bean =store.get(dto.productId);
		if(bean==null)
		{
			 bean =new RetailerInventoryBean();
		}
		bean.setRetailerId(dto.getRetailerId());
		bean.setProductUniqueId(dto.productUniqueId);
		return bean;
	}
	
	public static RetailerInventoryDTO convert(RetailerInventoryBean entity) {
		RetailerInventoryDTO dto=new RetailerInventoryDTO();
		dto.setRetailerId(entity.getRetailerId());
		dto.setProductId(entity.getProductUniqueId());
	    return dto;
	}
	
}
