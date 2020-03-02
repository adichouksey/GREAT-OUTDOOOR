package com.capgemini.go.inventoryms.util;
import java.util.*;
import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;
import com.capgemini.go.inventoryms.dao.RetailInventoryStore;
import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;

public class InventoryUtil {
	public static Map<String, RetailerInventoryDTO> retailerinventorydto = new HashMap<>();
	
	public RetailerInventoryBean convert(RetailerInventoryDTO dto) {
		Map<String,RetailerInventoryBean> store=RetailInventoryStore.retailerstore;
		RetailerInventoryBean bean =store.get(dto.productId);
		if(bean==null)
		{
			 bean =new RetailerInventoryBean();
		}
		bean.setRetailerId(dto.getRetailerId());
		bean.setProductUniqueId(dto.productUniqueId);
		bean.setProductCategoryName();
		bean.setProductCategoryNumber();
		bean.setShelfTimePeriod();
		return bean;
	}
}
