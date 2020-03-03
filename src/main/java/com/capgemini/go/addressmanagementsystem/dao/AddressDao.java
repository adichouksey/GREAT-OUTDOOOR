package com.capgemini.go.addressmanagementsystem.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;

public interface AddressDao {

	public List<AddressDTO> viewAllAddress(String userId);
	
	boolean addAddress(AddressDTO address);

	boolean updateAddress(AddressDTO address);

	boolean deleteAddress(AddressDTO address);
}
