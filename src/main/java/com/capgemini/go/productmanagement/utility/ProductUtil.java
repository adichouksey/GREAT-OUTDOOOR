package com.capgemini.go.productmanagement.utility;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;

public class ProductUtil {

	
	// Conversion of ProductDto to Product
	public static Product convertToProduct(ProductDTO product) {
		Product pro = new Product();
		pro.setProductid(product.getProductid());
		pro.setPrice(product.getPrice());
		pro.setColor(product.getColor());
		pro.setDimension(product.getDimension());
		pro.setSpecification(product.getSpecification());
		pro.setInfrastructure(product.getInfrastructure());
		pro.setQuatity(product.getQuatity());
		pro.setProductName(product.getProductName());
		return pro;
	}
	
	//Conversion of Product to ProductDto
	public static ProductDTO convertToProductDto(Product pro) {
		ProductDTO product = new ProductDTO();
		product.setProductid(pro.getProductid());
		product.setPrice(pro.getPrice());
		product.setColor(pro.getColor());
		product.setDimension(pro.getDimension());
		product.setSpecification(pro.getSpecification());
		product.setInfrastructure(pro.getInfrastructure());
		product.setQuatity(pro.getQuatity());
		product.setProductName(pro.getProductName());
		return product;
	}

	
}

