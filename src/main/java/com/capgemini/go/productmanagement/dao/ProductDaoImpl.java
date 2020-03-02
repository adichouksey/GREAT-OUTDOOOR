package com.capgemini.go.productmanagement.dao;

import java.util.*;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.InValidIdException;
import com.capgemini.go.productmanagement.exceptions.ProductException;
import com.capgemini.go.productmanagement.utility.ProductUtil;

public class ProductDaoImpl implements ProductDao {

	

	
	// to view all products
	@Override
	public List<ProductDTO> viewAllProducts() throws ProductException  {
		Collection<Product> products = ProductStore.map.values();
		List<ProductDTO> list = new ArrayList();

		for (Product product : products) {
			ProductDTO product1 = ProductUtil.convertToProductDto(product);
			list.add(product1);
		}

		return list;
	}

	// to add the products
	@Override
	public boolean addProduct(ProductDTO product) {

		
		// if the product is already present then it will throw the Exception
		if (ProductStore.map.containsKey(product.getProductid()))
			throw new ProductException("Product Already Exists");
		
		// if it is not present then it will add the product
		else {
			Product pro = ProductUtil.convertToProduct(product);
			ProductStore.map.put(pro.getProductid(), pro);
			return true;
		}
	}
	
	
	// to edit the product
	@Override
	public boolean editProduct(ProductDTO product) throws ProductException {
		
		// if the productID is not valid then it will throw the Exception
		if (product.getProductid() == null) {
			throw new InValidIdException("Incorrect Id ");
		} 
		
		// if the productID is valid then it will edit the product
		
		else {
			Product pro = ProductUtil.convertToProduct(product);
			ProductStore.map.put(pro.getProductid(), pro);
			return true;

		}

	}

	
	// to delete the product
	@Override
	public boolean deleteProduct(String productId) throws ProductException {
		
		// if the productID is not valid then it will throw the Exception
		Product p = ProductStore.map.get(productId);
		if (p == null) {
			throw new InValidIdException("Incorrect Id ");

		} 
		// if the productId is valid it will delete the product
		else
			ProductStore.map.remove(productId);
		return true;
	}
     
	//to find the product by ID
	@Override
      public Product findProductById(String productId)
      {
		// if the productID is not valid then it will throw the Exception
		
    	  Product pro=ProductStore.map.get(productId);
    	  if(pro==null)
    	  {
    		  throw new InValidIdException("Incorrect Id ");
    	  }
    	  
    	   // if the productId is valid it will return Product
    	  else
    		  return pro;
      }
}
