package com.capgemini.go.wishlistmanagementsystem.dao;

import java.util.*;

import com.capgemini.go.wishlistmanagementsystem.dto.ProductDTO;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;
import com.capgemini.go.wishlistmanagementsystem.exception.InvalidArgumentException;

import entities.UserWishes;
import entities.WishListItem;
import entities.WishlistUtil;

public class WishlistDaoImpl implements WishlistDao {
	// userid,userwishes object
	private List<WishlistDTO> wishStore = new ArrayList<>();
	private ProductDao productDao;

	public WishlistDaoImpl(ProductDao dao) {
		this.productDao = dao;
	}

	@Override
	public boolean addProductToWishlist(WishlistDTO dto) {
		WishListItem wishListItem=WishlistUtil.dtoToWishListItem(dto);
		String addObj=dto.getProductId();
		if (wishStore.contains(addObj)) {
			return false;
		}
		wishStore.add(dto);
		return true;
	}

	public  List<ProductDTO> getViewWishlist(String userId) {
		if(userId==null) {
			throw new InvalidArgumentException("Invalid argument ");
		}
		List<ProductDTO> desired = new ArrayList<ProductDTO>();
		for (WishlistDTO dto : wishStore) {
			if (dto.getUserId().equals(userId)) {
				ProductDTO productdto = productDao.findProductById(dto.getProductId());
				desired.add(productdto);
			}
		}
		return desired;
	}

	

}
