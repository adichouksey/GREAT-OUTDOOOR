package com.capgemini.go.inventoryms.dao;

import java.util.*;

import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;


public interface RetailerInventoryDao {
		public List<RetailerInventoryDTO> getSoldItemsDetails();
		public List<RetailerInventoryDTO> getDeliveredItemsDetails();
		public List<RetailerInventoryDTO> getItemListByRetailer(RetailerInventoryDTO dto);
		public List<RetailerInventoryDTO> getListOfRetailers();
		public boolean updateProductRecieveTimeStamp(RetailerInventoryDTO dto);
		public boolean updateProductSaleTimeStamp();
		public boolean insertitemRetailerinventory();
		public boolean deleteitemRetailerinventory() ;
	}


