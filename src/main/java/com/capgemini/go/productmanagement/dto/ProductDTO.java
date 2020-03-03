package com.capgemini.go.productmanagement.dto;

public class ProductDTO {

	
	private String productid;
	private double price;
	private String color;
	private String dimension;
	private String specification;
	private String infrastructure;
	private int quatity;
	private int productquatity;
	private int productCategory;
	private String productName;
	
	public ProductDTO()
	{
		this("",0.0,"","","","",0,0,0,"");
	}
	public ProductDTO(String productid,double price,String color,String dimension,String specification,String infrastructure,int quatity,int productquatityprivate ,int productCategory,String productName)
	{
		this.productid=productid;
		this.price=price;
		this.color=color;
		this.dimension=dimension;
		this.specification=specification;
		this.infrastructure=infrastructure;
		this.quatity=quatity;
		this.productquatity=productquatity;
		this.productCategory=productCategory;
		this.productName=productName;
		
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(String infrastructure) {
		this.infrastructure = infrastructure;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getProductquatity() {
		return productquatity;
	}
	public void setProductquatity(int productquatity) {
		this.productquatity = productquatity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || !(obj instanceof ProductDTO)) {
			return false;
		}
		ProductDTO productdto=(ProductDTO)obj;
		return this.productid.equals(productdto.getProductid());
	}
	
}
