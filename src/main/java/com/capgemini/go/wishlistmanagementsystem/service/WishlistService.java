package com.capgemini.go.wishlistmanagementsystem.service;

import java.util.*;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;

public interface WishlistService {
	
	public boolean addProductToWishlist(WishlistDTO dto);

	List<ProductDTO> getViewWishlist(String userId);
}
