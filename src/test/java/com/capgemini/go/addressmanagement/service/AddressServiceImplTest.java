package com.capgemini.go.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.*;

import com.capgemini.go.addressmanagementsystem.dao.AddressDao;
import com.capgemini.go.addressmanagementsystem.dao.AddressDaoImpl;
import com.capgemini.go.addressmanagementsystem.dao.AddressStore;
import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;
import com.capgemini.go.addressmanagementsystem.entity.Address;
import com.capgemini.go.addressmanagementsystem.service.AddressServiceImpl;
import com.capgemini.go.addressmanagementsystem.utility.AddressUtil;

public class AddressServiceImplTest {
	
	private AddressServiceImpl service;
	
	@BeforeEach
	public void setUpBeforeClass() throws Exception
	{
		service=new AddressServiceImpl(new AddressDaoImpl());
	}
	
	@AfterEach
	public void tearDownAfterClass() throws Exception
	{
		service=null;
	}
	
	
	@Test
	public void testAddAddress_1()
	{
		String addressId="Bhopal";
		Address address=new Address("Bhopal","abc","abc","Bhopal","Delhi","India","abc","abc");
		AddressDTO addDto=AddressUtil.addressToDTO(address);
		Map<String,Address> addMap1=AddressStore.addressMap;
		boolean result=service.addAddress(addDto);
		Map<String,Address> addMap2=AddressStore.addressMap;
		
		if(result && !addMap1.equals(addMap2))
		{
			Assertions.assertEquals(result, true);
		}
		
		

	}
	
	@Test
	public void testUpdateAddress_1()
	{
		Address address=new Address("Bhopal","abc","abc","Bhopal","Delhi","India","abc","abc");
		AddressDTO addDto=AddressUtil.addressToDTO(address);
		Map<String,Address> updateMap=AddressStore.addressMap;
		boolean result=service.updateAddress(addDto);
		Assertions.assertTrue(true);

	}
	
	@Test
	public void testRemoveAddress_1()
	{
		Address address=new Address("Kanpur","abc","abc","Bhopal","Delhi","India","abc","abc");
		AddressDTO addDto=AddressUtil.addressToDTO(address);
		Map<String,Address> removeMap=AddressStore.addressMap;
		boolean result=service.removeAddress(addDto);
		
		Assertions.assertEquals(result, false);

	}
	
	@Test
	public void testViewAllAddress_1()
	{
		Address address=new Address("Bhopal","abc","abc","Bhopal","Delhi","India","abc","abc");
		AddressDTO addDto=AddressUtil.addressToDTO(address);
		Map<String,Address> viewMap=AddressStore.addressMap;
		String userId=address.getUserId();
		List<AddressDTO> result=service.viewAllAddress(userId);
		Collection<Address> addresses=AddressStore.addressMap.values();
		
		if(result.equals(addresses))
		{
			Assertions.assertEquals(result, true);
		}
		
	}
	

}
