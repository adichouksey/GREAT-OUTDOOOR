package com.capgemini.go.productmanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.go.productmanagement.dao.ProductDao;
import com.capgemini.go.productmanagement.dao.ProductDaoImpl;
import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.InValidIdException;
import com.capgemini.go.productmanagement.exceptions.ProductException;
import com.capgemini.go.productmanagement.utility.ProductValidation;

public class ProductServiceImpl implements ProductService {

	private ProductDao dao;

	public ProductServiceImpl(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public List<ProductDTO> viewAllProducts()  {
		return	dao.viewAllProducts();
	}

	@Override
	public boolean addProduct(ProductDTO product)  {
		ProductValidation.productValidation(product);
		    dao.addProduct(product);
		    return true;
	}
	
	@Override
	public boolean editProduct(ProductDTO product)  {
		ProductValidation.productValidation(product);
		dao.editProduct(product);
		return true;
		
	}

	@Override
	public boolean deleteProduct(String productId)  {

		if (productId == null)
				throw new InValidIdException("Incorrect ID");
		else {
				dao.deleteProduct(productId);
				return true;
		}
		
	}
	@Override

        public Product findProductById(String productId){
		
		if (productId == null)
			throw new InValidIdException("InValid Id");
	else {
			Product p=dao.findProductById(productId);
			return p;
	}
		
	}
}
