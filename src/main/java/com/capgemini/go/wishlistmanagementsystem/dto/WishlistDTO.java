package com.capgemini.go.wishlistmanagementsystem.dto;

public class WishlistDTO {
	
	private String productId;
	
	public WishlistDTO(String productId) {
		
		this.productId=productId;
		
	}
	
	public WishlistDTO() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	

}
