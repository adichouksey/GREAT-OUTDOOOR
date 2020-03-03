package com.capgemini.go.addressmanagementsystem.service;

import java.util.List;

import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;

public interface AddressService {
	
	public List<AddressDTO> viewAllAddress(String s);
	public boolean addAddress(AddressDTO dto);
	public boolean updateAddress(AddressDTO dto);
	public boolean removeAddress(AddressDTO dto);
	

}
