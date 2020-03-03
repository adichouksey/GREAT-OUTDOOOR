package com.capgemini.go.inventoryms.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import com.capgemini.go.inventoryms.dao.RetailerInventoryDao;
import com.capgemini.go.inventoryms.dao.RetailerInventoryDaoImpl;
<<<<<<< HEAD
=======

	public class RetailerInventoryServiceImpl implements RetailerInventoryService {
>>>>>>> 991222646237fd6973ec83f94104834f8e87355e

import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;

public class RetailerInventoryServiceImpl implements RetailerInventoryService {

	private RetailerInventoryDao rDao = new RetailerInventoryDaoImpl();

	public List<RetailerInventoryBean> getMonthlyShelfTimeReport(String retailerId) {
		
	}

	public List<RetailerInventoryBean> getQuarterlyShelfTimeReport(String retailerId) {
		
	}

	public List<RetailerInventoryBean> getYearlyShelfTimeReport(String retailerId) {
		
	}

	public List<RetailerInventoryBean> getOutlierCategoryItemWiseDeliveryTimeReport(String retailerId,
			
	}

	public List<RetailerInventoryBean> getItemWiseDeliverytimeReport(String retailerId, String productName) {

		

	}

	public List<RetailerInventoryBean> getCategoryWiseDeliveryTimeReport(String retailerId, int productCategory) {
		

	}

}
