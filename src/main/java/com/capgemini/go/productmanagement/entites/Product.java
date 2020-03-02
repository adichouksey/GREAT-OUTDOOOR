package com.capgemini.go.productmanagement.entites;

public class Product {

        private String productid;
		private double price;
		private String color;
		private String dimension;
		private String specification;
		private String infrastructure;
		private int quatity;
		private int productquatity;
		private String productName;
		
		
		
		//Default Constructor
		public Product() {
		    this("",0.0,"","","","",0,0,"");
		}
		
		//Parameterized Constructor
		public Product(String productid,double price,String color,String dimension,String specification,String infrastructure,int quatity,int productquatity,String productName)
		{
			this.productid=productid;
			this.price=price;
			this.color=color;
			this.dimension=dimension;
			this.specification=specification;
			this.infrastructure=infrastructure;
			this.quatity=quatity;
			this.productquatity=productquatity;
			this.productName=productName;
		}
		
		
		
		//Setters and Getters
		
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
		
		
		
		
	}


