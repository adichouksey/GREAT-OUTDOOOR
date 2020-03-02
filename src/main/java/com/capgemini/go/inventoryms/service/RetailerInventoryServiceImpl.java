package com.capgemini.go.service;

	import java.time.LocalDate;
	import java.time.Period;
	import java.util.*;

	public class RetailerInventoryServiceImpl implements RetailerInventoryService {

		private RetailerInventoryDao rDao=new RetailerInventoryDaoImpl();

		public List<RetailerInventoryBean> getMonthlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> result=new ArrayList<RetailerInventoryBean>();
			List<RetailerInventoryBean> retailInventoryBean = DataBaseEntry.getRetailInventory();
			for (Iterator iterator = retailInventoryBean.iterator(); iterator.hasNext();) {
				RetailerInventoryBean r = (RetailerInventoryBean) iterator.next();

				if(r.getShelfTimePeriod().getDays()<=30 && r.getShelfTimePeriod().getMonths()==0 && r.getShelfTimePeriod().getYears()==0)
				{
					result.add(r);
				}
			}
			return result;
		}

		public List<RetailerInventoryBean> getQuarterlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> result=DataBaseEntry.retailInventory;
			List<RetailerInventoryBean> retailInventoryBean = DataBaseEntry.getRetailInventory();
			for (Iterator iterator = retailInventoryBean.iterator(); iterator.hasNext();) {
				RetailerInventoryBean r = (RetailerInventoryBean) iterator.next();
				if(r.getShelfTimePeriod().getMonths()>4 && r.getShelfTimePeriod().getYears()==0)
				{
					result.add(r);
				}
			}
			return result;
		}

		public List<RetailerInventoryBean> getYearlyShelfTimeReport(String retailerId) {
			List<RetailerInventoryBean> result=new ArrayList<RetailerInventoryBean>();
			List<RetailerInventoryBean> retailInventoryBean = DataBaseEntry.getRetailInventory();
			for (Iterator iterator = retailInventoryBean.iterator(); iterator.hasNext();) {
				RetailerInventoryBean r = (RetailerInventoryBean) iterator.next();

				if(r.getShelfTimePeriod().getYears()>1)
				{
					result.add(r);
				}
			}
			return result;
		}

		public List<RetailerInventoryBean> getOutlierCategoryItemWiseDeliveryTimeReport(String retailerId, int productCategory) {
			List<RetailerInventoryBean> result=new ArrayList<RetailerInventoryBean>();
			List<RetailerInventoryBean> retailInventoryBean = DataBaseEntry.getRetailInventory();
			return null;
		}

		public List<RetailerInventoryBean> getItemWiseDeliverytimeReport(String retailerId, String productName) {

			List<RetailerInventoryBean> result=DataBaseEntry.getRetailInventory();
			List<RetailerInventoryBean> periodList =new ArrayList<>();
			for (Iterator iterator = result.iterator(); iterator.hasNext();) {
				RetailerInventoryBean r = (RetailerInventoryBean) iterator.next();
				if(r.getProductCategoryName().equals(productName)){
					periodList.add(r);
				}
			}
			return periodList;
			
		}

		public List<RetailerInventoryBean> getCategoryWiseDeliveryTimeReport(String retailerId, int productCategory) {
			List<RetailerInventoryBean> result=DataBaseEntry.getRetailInventory();
			List<RetailerInventoryDTO> list=new ArrayList<>();
			List<RetailerInventoryBean> periodList=new ArrayList<>();
			for (Iterator iterator = result.iterator(); iterator.hasNext();) {
				RetailerInventoryBean r = (RetailerInventoryBean) iterator.next();
				if(r.getProductCategoryNumber()==productCategory){
					periodList.add(r);

				}	

			}
			return periodList;

		}

	}

