package com.capgemini.go.addressmanagementsystem.service;

import java.util.*;

import com.capgemini.go.addressmanagementsystem.dao.AddressDao;
import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;
import com.capgemini.go.addressmanagementsystem.utility.AddressValidation;

public class AddressServiceImpl implements AddressService {
	private AddressDao addressDao;
	public AddressServiceImpl(AddressDao dao)
	{
		this.addressDao=dao;
	}
	
	@Override
	public List<AddressDTO> viewAllAddress(String userId) {
		AddressValidation.validUserId(userId);
		return addressDao.viewAllAddress(userId);
	}

	@Override
	public  boolean addAddress(AddressDTO dto) {		
		AddressValidation.addressValidation(dto);
		boolean flag=addressDao.addAddress(dto);
		return flag;
	}

	@Override
	public boolean updateAddress(AddressDTO dto) {		
		AddressValidation.addressValidation(dto);
		boolean flag=addressDao.updateAddress(dto);
		return flag;
		
	}

	@Override
	public boolean removeAddress(AddressDTO dto) {		
		AddressValidation.addressValidation(dto);
		boolean flag=addressDao.deleteAddress(dto);
		return flag;
	}

	
}
