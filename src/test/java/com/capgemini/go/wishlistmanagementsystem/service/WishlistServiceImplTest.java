package com.capgemini.go.wishlistmanagementsystem.service;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dao.WishlistDaoImpl;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;

public class WishlistServiceImplTest {

	private WishlistServiceImpl service;

	@BeforeEach
	public void setUpBeforeClass() {
		service = new WishlistServiceImpl(new WishlistDaoImpl());
	}

	@Test()

	public void testAddProductToWishlist() {
		WishlistDTO wishList = new WishlistDTO("5");

		boolean result = service.addProductToWishlist(wishList);
		Assertions.assertEquals(true, result);

	}

	@Test()
	public void testGetViewWishlist() {

		List<ProductDTO> list = new LinkedList<ProductDTO>();
		Assertions.assertEquals(list, service.getViewWishlist("5"));

	}

}
