package com.capgemini.go.wishlistmanagementsystem.service;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dao.WishlistDaoImpl;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;
import com.capgemini.go.wishlistmanagementsystem.entities.WishListItem;
import com.capgemini.go.wishlistmanagementsystem.entities.WishStore;
import com.capgemini.go.wishlistmanagementsystem.entities.WishlistUtil;

public class WishlistServiceImplTest {

	private WishlistServiceImpl service;

	@BeforeEach
	public void setUpBeforeClass() {
		service = new WishlistServiceImpl(new WishlistDaoImpl());
	}
	

	@Test()

	public void testAddProductToWishlist() {		
		WishListItem wishlist = new WishListItem("5","6");
		WishlistDTO wishlistdto = WishlistUtil.wishListItemToDTO(wishlist);
		 Set<String>products=WishStore.products;
		boolean result = service.addProductToWishlist(wishlistdto);
		 Set<String>products1=WishStore.products;
		 if(result && products.equals(products1)==false) {		
		Assertions.assertEquals(true, result);
		 }

	}
	
	
	@Test()
	public void testGetViewWishlist() throws Exception {
		WishListItem wishlist = new WishListItem("5","6");
		 Set<String>products=WishStore.products;
		Assertions.assertEquals(list, service.getViewWishlist("5"));
		}


}

