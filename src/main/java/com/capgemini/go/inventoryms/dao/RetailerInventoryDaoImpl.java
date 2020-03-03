package com.capgemini.go.inventoryms.dao;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.*;

import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;
import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;
import com.capgemini.go.inventoryms.util.InventoryUtil;
//import com.capgemini.go.exception.RetailerInventoryException;

public class RetailerInventoryDaoImpl implements RetailerInventoryDao{
	@Override
	public List<RetailerInventoryDTO> getSoldItemsDetails() {
		LocalDate today=LocalDate.now();
		List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
		
		for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
			RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
			if(today.isAfter((ChronoLocalDate) re.productSaleTimestamp)){
				ret.add(re);
			}
			
		}
		return ret;
	}

	@Override
	public List<RetailerInventoryDTO> getDeliveredItemsDetails() {
			
			LocalDate today=LocalDate.now();
			List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
			
			for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
				RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
				if(today.isAfter((ChronoLocalDate) re.productRecieveTimestamp)){
					ret.add(re);
				}
				
			}
			return ret;
		
	}

	/**
	 * returns list of inventories of the retailer represented by dto argument in method
	 */
	@Override
	public List<RetailerInventoryDTO> getItemListByRetailer(RetailerInventoryDTO dto) {
        List<RetailerInventoryDTO> desired = new ArrayList<>();
        Collection<RetailerInventoryBean>inventories=RetailInventoryStore.inventoryStore.values(); 
        for(RetailerInventoryBean entity: inventories) {
        	if(entity.getRetailerId().equals(dto.getRetailerId())) {
        		RetailerInventoryDTO desiredDto=InventoryUtil.convert(entity);
        		desired.add(desiredDto);
        	}
        }
		
        return desired;
	}
	
	/**
	 * returns list of all retailers where every retailer is represented by inventorydto
	 */
	@Override
	public List<RetailerInventoryDTO> getListOfRetailers() {
		 List<RetailerInventoryDTO> desired = new ArrayList<>();
		 Set<String>retailersId=new HashSet<>();
	        Collection<RetailerInventoryBean>inventories=RetailInventoryStore.inventoryStore.values(); 
	        for(RetailerInventoryBean entity: inventories) {	        	
	        	    if(!retailersId.contains(entity.getRetailerId()))
	        		{
	        	    	retailersId.add(entity.getRetailerId());
		        		RetailerInventoryDTO desiredDto=InventoryUtil.convert(entity);
	        	    	desired.add(desiredDto);
	        	}
	        }
			
	        return desired;
	}

	@Override
	public boolean updateProductRecieveTimeStamp(RetailerInventoryDTO dto) {
		/*
		 * No fields present for RecieveTimeStamp
		 */
		
		return false;
	}

	@Override
	public boolean updateProductSaleTimeStamp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertitemRetailerinventory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteitemRetailerinventory() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
