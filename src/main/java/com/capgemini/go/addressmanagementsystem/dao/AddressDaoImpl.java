package com.capgemini.go.addressmanagementsystem.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Set;

import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;
import com.capgemini.go.addressmanagementsystem.entity.Address;
import com.capgemini.go.addressmanagementsystem.service.AddressServiceImpl;
import com.capgemini.go.addressmanagementsystem.utility.AddressUtil;
import com.capgemini.go.addressmanagementsystem.utility.AddressValidation;

public class AddressDaoImpl implements AddressDao{
	
	
	
	@Override
	public boolean addAddress(AddressDTO dto) {	
		Address address=AddressUtil.dtoToAddress(dto);
		String addId=dto.getAddressId();
		if(!AddressStore.addressMap.containsKey(addId))
		{	
			AddressStore.addressMap.put(dto.getAddressId(),address);
			return true;
		}
		
		return false;
		
		
	}

	@Override
	public boolean updateAddress(AddressDTO dto) {
		String addId=dto.getAddressId();		
		if(!AddressStore.addressMap.containsKey(addId))
		{	
			return false;
		}
		Address address=AddressUtil.dtoToAddress(dto);
		AddressStore.addressMap.put(dto.getAddressId(),address);
		return true;
		
	}

	@Override
	public boolean deleteAddress(AddressDTO dto) {		
		String addId=dto.getAddressId();		
		if(!AddressStore.addressMap.containsKey(addId))
		{
			
			return false;
		}
		AddressStore.addressMap.remove(addId);
		return true;
		
	}

	@Override
	public List<AddressDTO> viewAllAddress(String userId) {		
		List<AddressDTO> addressList=new ArrayList<>();
		for(Address address:AddressStore.addressMap.values())
		{
			if(address.getUserId().equals(userId)) {
			AddressDTO addressDTO=AddressUtil.addressToDTO(address);
			addressList.add(addressDTO);
			}
		}
		return addressList;
		
		
	}
	

}
