package com.capgemini.go.wishlistmanagementsystem.dao;

import java.util.*;

import com.capgemini.go.wishlistmanagementsystem.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;




	public interface WishlistDao {
		
		public boolean addProductToWishlist(WishlistDTO dto) ;
			
			public List<ProductDTO> getViewWishlist(String userId);
		}
