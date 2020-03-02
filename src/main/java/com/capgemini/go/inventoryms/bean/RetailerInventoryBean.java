package com.capgemini.go.inventoryms.bean;

import java.time.Period;

public class RetailerInventoryBean {

private String retailerId;
private String retailerName;
private int ProductCategoryNumber;
private String ProductCategoryName;
private String ProductName;
private String ProductUniqueId;
public Period deliveryTimePeriod;
private Period ShelfTimePeriod;

public String getRetailerId() {
	return retailerId;
}
public RetailerInventoryBean() {
	
}
public RetailerInventoryBean(String retailerId, String retailerName, int ProductCategoryNumber,
		String productCategoryName, String productName, String productUniqueId, Period deliveryTimePeriod,
		Period shelfTimePeriod) {
	this.retailerId = retailerId;
	this.retailerName = retailerName;
	ProductCategoryNumber = this.ProductCategoryNumber;
	this.ProductCategoryName = productCategoryName;
	this.ProductName = productName;
	this.ProductUniqueId = productUniqueId;
	this.deliveryTimePeriod = deliveryTimePeriod;
	this.ShelfTimePeriod = shelfTimePeriod;
}

@Override
public String toString() {
	return "\nRetailerInventoryBean [retailerId=" + retailerId + ", retailerName=" + retailerName
			+ ", ProductCategoryNumber=" + ProductCategoryNumber + ", ProductCategoryName=" + ProductCategoryName
			+ ", ProductName=" + ProductName + ", ProductUniqueId=" + ProductUniqueId + ", deliveryTimePeriod="
			+ deliveryTimePeriod + ", ShelfTimePeriod=" + ShelfTimePeriod + "]";
}


public void setRetailerId(String retailerId) {
	this.retailerId = retailerId;
}
public String getRetailerName() {
	return retailerName;
}
public void setRetailerName(String retailerName) {
	this.retailerName = retailerName;
}
public int getProductCategoryNumber() {
	return ProductCategoryNumber;
}

public void setProductCategoryNumber(byte productCategoryNumber) {
	ProductCategoryNumber = productCategoryNumber;
}

public String getProductCategoryName() {
	return ProductCategoryName;
}
public void setProductCategoryName(String productCategoryName) {
	ProductCategoryName = productCategoryName;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductUniqueId() {
	return ProductUniqueId;
}
public void setProductUniqueId(String productUniqueId) {
	ProductUniqueId = productUniqueId;
}
public Period getDeliveryTimePeriod() {
	return deliveryTimePeriod;
}
public void setDeliveryTimePeriod(Period deliveryTimePeriod) {
	this.deliveryTimePeriod = deliveryTimePeriod;
}
public Period getShelfTimePeriod() {
	return ShelfTimePeriod;
}
public void setShelfTimePeriod(Period shelfTimePeriod) {
	ShelfTimePeriod = shelfTimePeriod;
}

}
