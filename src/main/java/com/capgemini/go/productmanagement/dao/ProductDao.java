package com.capgemini.go.productmanagement.dao;

import java.util.List;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.ProductException;


public interface ProductDao {

	/*
	 *  Function Name : viewAllProducts - Input Parameters : - Return Type :
	 * List<ProductDTO> - Throws : ProductException */
	
	List<ProductDTO> viewAllProducts();
	
	/*  Function Name : addProduct - Input Parameters : <ProductDTO> product -
	 * Return Type : boolean - Throws : ProductException*/
	
	boolean addProduct(ProductDTO product);
	
	/*  Function Name : editProduct - Input Parameters : <ProductDTO> product -
	 * Return Type : boolean - Throws : ProductException*/
	
	boolean editProduct(ProductDTO product);
	
	/*
	 *  Function Name : deleteProduct - Input Parameters : String productId
	 *  Return  Type : boolean - Throws : ProductException*/
	
	boolean deleteProduct(String productId);
	
	/*
	 *  Function Name : findProductById - Input Parameters : String productId
	 *  Return  Type : Product - Throws : ProductException*/
	
	public Product findProductById(String productId);
	
}
