package com.capgemini.go.inventoryms.dao;
//	import com.capgemini.go.dto.RetailerInventoryDTO;
import java.util.*;

import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;

public interface RetailerInventoryDao {
		public List<RetailerInventoryDTO> getSoldItemsDetails();
		public List<RetailerInventoryDTO> getDeliveredItemsDetails();
		public List<RetailerInventoryDTO> getItemListByRetailer();
		public List<RetailerInventoryDTO> getListOfRetailers();
		public boolean updateProductRecieveTimeStamp();
		public boolean updateProductSaleTimeStamp();
		public boolean insertitemRetailerinventory();
		public boolean deleteitemRetailerinventory() ;
	}


