package com.capgemini.go.wishlistmanagementsystem.service;


import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.go.wishlistmanagementsystem.dao.WishlistDao;
import com.capgemini.go.wishlistmanagementsystem.dao.WishlistDaoImpl;
import com.capgemini.go.wishlistmanagementsystem.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;
import com.capgemini.go.wishlistmanagementsystem.service.WishlistServiceImpl;



public class WishlistServiceImplTest {

	WishlistServiceImpl obj=new WishlistServiceImpl(new WishlistDaoImpl());
	 
	 @Test()
	 public void testAddProductToWishlist()
	 {
		 WishlistDTO wishList = new WishlistDTO("5");
	
		 boolean result = obj.addProductToWishlist(wishList);
		 Assertions.assertEquals(true,result );

	 }
	 
	 @Test()
	 public void testGetViewWishlist() {
		 

			List <ProductDTO> list=new LinkedList< ProductDTO>();
			 Assertions.assertEquals( list,obj.getViewWishlist("5"));
			
		 }
		 
	 }





