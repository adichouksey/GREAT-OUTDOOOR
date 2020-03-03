package com.capgemini.go.productmanagement.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.capgemini.go.productmanagement.dao.ProductDaoImpl;
import com.capgemini.go.productmanagement.dao.ProductStore;
import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.exceptions.ProductException;
import com.capgemini.go.productmanagement.utility.ProductUtil;
import com.capgemini.go.productmanagement.utility.ProductValidation;

public class ProductServiceTest {

	private ProductServiceImpl service;

	
	//Before each test case service will be created 
	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		service = new ProductServiceImpl(new ProductDaoImpl());
	}

	//After each test map gets clear
	@AfterEach
	public void tearDownAfterClass() throws Exception {
		service = null;
		ProductStore.map.clear();
	}

	

// test case 1 for add product
	
@Test
	public void testAddProductService_1() {	
		String productid="AD12";
	Product product=new Product(productid, 1678, "GREEN", "112*500*86", "Rubber",
			  "Capgemini", 78, 102,89, "Tyre");
	ProductDTO productDto=ProductUtil.convertToProductDto(product);
	Map<String,Product> map1= ProductStore.map;
	boolean result=service.addProduct(productDto);
	Map<String,Product> map2= ProductStore.map;
	if(result && map1.equals(map2)==false)
	Assertions.assertEquals(true,result);
	}

	
//test case 2 for add product
@Test
	public void testAddProductService_2() {	
		String productid="AD13";
	Product product=new Product(productid, 14478, "BROWN", "172*589*86", "Rubber",
			  "Capgemini", 38, 132,45, "Tyre");
	ProductDTO productDto=ProductUtil.convertToProductDto(product);
	Map<String,Product> map1= ProductStore.map;
	boolean result=service.addProduct(productDto);
	Map<String,Product> map2= ProductStore.map;
	if(result && map1.equals(map2)==false)
	Assertions.assertEquals(true,result);
	}


	
//test case for edit product
	@Test
	void testeditProductService() throws ProductException {
		ProductDTO productTest = new ProductDTO("A104", 9087, "Blue", "100*500*200", "Plastic", "Capgemini", 20, 108,78,
				"Bottel");
		Assertions.assertTrue(service.editProduct(productTest));
	}

	
	// test case 1 for delete product by id
	
	
	@Test
	
	
	void testdeleteProductService_1() throws ProductException {
			//Assertions.assertTrue(service.deleteProduct("A104"));
		
		Product productTest=new Product("M104", 1678, "GREEN", "112*500*86", "Rubber",
				  "Capgemini", 78, 102,12, "Tyre");
		Map<String,Product> map= ProductStore.map;
		map.put(productTest.getProductid(),productTest);
		String productId=productTest.getProductid();
		service.deleteProduct(productId);
		boolean isEmpty=map.isEmpty();
		Assertions.assertEquals(true,isEmpty);
		
	}
	
	//// test case 2 for delete product by id
	@Test
	void testdeleteProductService_2() throws ProductException {
			//Assertions.assertTrue(service.deleteProduct("A104"));
		
		Product productTest=new Product("B121", 1896, "YELLOW", "152*580*96", "Rubber",
				  "Capgemini", 98, 152,20, "Tyre");
		Map<String,Product> map= ProductStore.map;
		map.put(productTest.getProductid(),productTest);
		String productId=productTest.getProductid();
		service.deleteProduct(productId);
		boolean isEmpty=map.isEmpty();
		Assertions.assertEquals(true,isEmpty);
		
	}
	
	
	// test case 1 for find  product by id
	 @Test
	public void testfindById_1() {
	
	Product productTest=new Product("B104", 1678, "GREEN", "112*500*86", "Rubber",
			  "Capgemini", 78, 102,56, "Tyre");
	Map<String,Product> map= ProductStore.map;
	map.put(productTest.getProductid(),productTest);
	Product result=service.findProductById(productTest.getProductid());
	
	//Assertions.assertEquals(productTest.getProductid(), result.getProductid());
	Assertions.assertEquals("B104", result.getProductid());
	}

	 
	// test case 2 for find  product by id
	  @Test
	 public void testfindById_2() {
			
			Product productTest=new Product("D103", 1578, "RED", "112*500*86", "Rubber",
					  "Capgemini", 79, 103,85, "Tyre");
			Map<String,Product> map= ProductStore.map;
			map.put(productTest.getProductid(),productTest);
			Product result=service.findProductById(productTest.getProductid());
			
			//Assertions.assertEquals(productTest.getProductid(), result.getProductid());
			Assertions.assertEquals("D103", result.getProductid());
			}
	  
	  
	  @Test
	  public void  testviewAllProducts_1() {
		  Product productTest=new Product("D103", 1578, "RED", "112*500*86", "Rubber",
				  "Capgemini", 79, 103,45, "Tyre");
		Map<String,Product> map= ProductStore.map;
		String productId=productTest.getProductid();
		List<ProductDTO> result=service.viewAllProducts();
		Collection<Product> product=ProductStore.map.values();
		
		if(result.equals(product)) {
			Assertions.assertEquals(result, true);
		}
	  }
}
