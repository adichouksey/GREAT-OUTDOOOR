package com.capgemini.go.wishlistmanagementsystem.dao;

import java.util.*;
import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;
import com.capgemini.go.wishlistmanagementsystem.exception.InvalidArgumentException;




	public interface WishlistDao {
		
		public boolean addProductToWishlist(WishlistDTO dto)  ;
			
			public List<ProductDTO> getViewWishlist(String userId) ;
		}
