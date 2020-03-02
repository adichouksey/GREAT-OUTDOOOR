package com.capgemini.go.wishlistmanagementsystem.entities;

import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;

public class WishlistUtil {
	
	public static WishlistDTO WishListItemToDTO(WishListItem wishListItem) {
		
		WishlistDTO dto=new WishlistDTO();
		dto.setProductId(wishListItem.getProductId());
		dto.setUserId(wishListItem.getUserId());
		
		return dto;
		
		
	}
	
	public static WishListItem dtoToWishListItem(WishlistDTO dto) {
		
		WishListItem wishListItem= new WishListItem();
		wishListItem.setProductId(dto.getProductId());
		wishListItem.setUserId(dto.getUserId());
		
		return wishListItem;
	
		
	}

}
