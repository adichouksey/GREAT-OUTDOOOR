package com.capgemini.go.addressmanagementsystem.entity;

public class Address {

	private String addressId;
	private String retailerid;
	private String buildingNo;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String userId;
	
	
	
	public Address(String addressId, String retailerid, String buildingNo, String city, String state, String country,
			String zip, String userId) 
	{
		this.addressId = addressId;
		this.retailerid = retailerid;
		this.buildingNo = buildingNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.userId = userId;
	}
	public Address()
	{
		
	}
	
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(String retailerid) {
		this.retailerid = retailerid;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	

}
