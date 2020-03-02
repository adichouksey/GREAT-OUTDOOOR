package com.capgemini.go.productmanagement.service;

import java.util.List;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.ProductException;

public interface ProductService {

	
	List<ProductDTO> viewAllProducts();
	boolean addProduct(ProductDTO product);
	boolean editProduct(ProductDTO product);
	boolean deleteProduct(String productId);
	public Product findProductById(String productId);
}
