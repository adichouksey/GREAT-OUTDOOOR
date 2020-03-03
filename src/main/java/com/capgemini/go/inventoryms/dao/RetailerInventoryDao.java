package com.capgemini.go.inventoryms.dao;
<<<<<<< HEAD

import java.util.*;

import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;

=======
//	import com.capgemini.go.dto.RetailerInventoryDTO;
import java.util.*;

import com.capgemini.go.inventoryms.dto.RetailerInventoryDTO;
>>>>>>> 991222646237fd6973ec83f94104834f8e87355e

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


