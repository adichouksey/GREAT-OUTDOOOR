package com.capgemini.go.productmanagement.utility;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.go.productmanagement.dao.ProductDaoImpl;
import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.ProductException;

public class ProductValidation {

	public static void  productValidation(ProductDTO product) {
	
		// To do the Validation
		String id = product.getProductid();
		boolean flag = id.matches("\\D\\w+");
		if (!flag) {
			throw new ProductException("No Product Added");
		}
		
	}

}
