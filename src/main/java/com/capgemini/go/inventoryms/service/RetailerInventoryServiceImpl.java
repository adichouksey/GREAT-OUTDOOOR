package com.capgemini.go.inventoryms.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import com.capgemini.go.inventoryms.bean.RetailerInventoryBean;
import com.capgemini.go.inventoryms.dao.RetailInventoryStore;
import com.capgemini.go.inventoryms.dao.RetailerInventoryDao;
import com.capgemini.go.inventoryms.dao.RetailerInventoryDaoImpl;
<<<<<<< HEAD
=======

	public class RetailerInventoryServiceImpl implements RetailerInventoryService {
>>>>>>> 991222646237fd6973ec83f94104834f8e87355e

<<<<<<< HEAD
		private RetailerInventoryDao rDao=new RetailerInventoryDaoImpl();

		public List<RetailerInventoryBean> getMonthlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> desired=new ArrayList<RetailerInventoryBean>();
			Collection<RetailerInventoryBean> fetched=RetailInventoryStore.retailerstore.values();
			for (RetailerInventoryBean bean:fetched) {
	            Period period=bean.getShelfTimePeriod();
				if(period.getMonths()==1)
				{
					desired.add(bean);
				}
			}
			return desired;
		}

		public List<RetailerInventoryBean> getQuarterlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> desired=new ArrayList<RetailerInventoryBean>();
			Collection<RetailerInventoryBean>fetched=RetailInventoryStore.retailerstore.values();
			for (RetailerInventoryBean bean:fetched) {
				  Period period=bean.getShelfTimePeriod();
					if(((period.getMonths())==4)) 
					{
						desired.add(bean);
					}
				}
				return desired;
		}

		public List<RetailerInventoryBean> getYearlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> desired=new ArrayList<RetailerInventoryBean>();
			Collection<RetailerInventoryBean>fetched=RetailInventoryStore.retailerstore.values();
			for (RetailerInventoryBean bean:fetched) {
				  Period period=bean.getShelfTimePeriod();
					if(period.getYears()==1) 
					{
					desired.add(bean);	
					}
				}
				return desired;
		}

		public List<RetailerInventoryBean> getOutlierCategoryItemWiseDeliveryTimeReport(String retailerId, int productCategory) {
			return null;
			
		}

		public List<RetailerInventoryBean> getItemWiseDeliverytimeReport(String retailerId, String productName) {

			List<RetailerInventoryBean> desired=new ArrayList<RetailerInventoryBean>();
			Collection<RetailerInventoryBean>fetched=RetailInventoryStore.retailerstore.values();
			for (RetailerInventoryBean bean:fetched) {
				  //Period period=bean.getShelfTimePeriod();
				  if(bean.getProductUniqueId().equals(productName)){
						desired.add(bean);
					}
				}
				return desired;
=======
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
>>>>>>> fd14eea526f87ad0deb897e173e0cbf93905034e
			
	}

<<<<<<< HEAD
		public List<RetailerInventoryBean> getCategoryWiseDeliveryTimeReport(String retailerId, int productCategory) {
			List<RetailerInventoryBean> desired=new ArrayList<RetailerInventoryBean>();
			Collection<RetailerInventoryBean>fetched=RetailInventoryStore.retailerstore.values();
			for (RetailerInventoryBean bean:fetched) {
				  //Period period=bean.getShelfTimePeriod();
				  if(bean.getProductUniqueId().equals(productCategory)){
						desired.add(bean);
					}
				}
				return desired;
=======
	public List<RetailerInventoryBean> getItemWiseDeliverytimeReport(String retailerId, String productName) {

		

	}
>>>>>>> fd14eea526f87ad0deb897e173e0cbf93905034e

	public List<RetailerInventoryBean> getCategoryWiseDeliveryTimeReport(String retailerId, int productCategory) {
		

	}

}
