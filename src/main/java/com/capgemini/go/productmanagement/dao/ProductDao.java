package com.capgemini.go.productmanagement.dao;

import java.util.List;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.ProductException;


public interface ProductDao {

	//to view the product
	List<ProductDTO> viewAllProducts();
	
	//to add the Product
	boolean addProduct(ProductDTO product);
	
	//to edit the product
	boolean editProduct(ProductDTO product);
	
	//to delete the product
	boolean deleteProduct(String productId);
	
	//to find the product by Id
	public Product findProductById(String productId);
	
}
