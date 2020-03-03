package com.capgemini.go.addressmanagementsystem.utility;

import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;
import com.capgemini.go.addressmanagementsystem.entity.Address;

public class AddressUtil {

	public static  AddressDTO addressToDTO(Address address)
	{
		AddressDTO dto=new AddressDTO();
		dto.setRetailerid(address.getUserId());
		dto.setAddressId(address.getAddressId());
		dto.setBuildingNo(address.getBuildingNo());
		dto.setCity(address.getCity());
		dto.setCountry(address.getCountry());
		dto.setRetailerid(address.getRetailerid());
		dto.setState(address.getState());
		dto.setZip(address.getZip());
		
		return dto;
	}
	
	public static Address dtoToAddress(AddressDTO dto)
	{
		Address address=new Address();
		address.setUserId(dto.getRetailerid());
		address.setAddressId(dto.getAddressId());
		address.setBuildingNo(dto.getBuildingNo());
		address.setCity(dto.getCity());
		address.setCountry(dto.getCountry());
		address.setRetailerid(dto.getRetailerid());
		address.setState(dto.getState());
		address.setZip(dto.getZip());
		
		return address;
		
	}
	
	
	
	
	
}
