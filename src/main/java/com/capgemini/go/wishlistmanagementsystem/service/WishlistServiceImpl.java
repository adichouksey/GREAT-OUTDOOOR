package com.capgemini.go.wishlistmanagementsystem.service;

import java.util.*;

import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dao.WishlistDao;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;

public class WishlistServiceImpl implements WishlistService {

	private WishlistDao wishlistDao;

	public WishlistServiceImpl(WishlistDao dao) {
		this.wishlistDao = dao;
	}

	@Override
	public boolean addProductToWishlist(WishlistDTO dto) {
		boolean result = wishlistDao.addProductToWishlist(dto);
		return result;

	}

	@Override
	public List<ProductDTO> getViewWishlist(String userId) {

		List<ProductDTO> list = wishlistDao.getViewWishlist(userId);
		return list;
	}

}


