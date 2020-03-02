package com.capgemini.go.addressmanagementsystem.utility;

import java.util.ArrayList;

import java.util.List;

import com.capgemini.go.addressmanagementsystem.dto.AddressDTO;

import Exceptions.IncorrectArgumentException;

public class AddressValidation {
	private static List<String> cityNames=new ArrayList<>();
	private static List<String> stateNames=new ArrayList<>();
	private static List<String> countryNames=new ArrayList<>();
	
	static public void addressValidation(AddressDTO dto)
	{
		String city=dto.getCity();
		String country=dto.getCountry();
		String state=dto.getState();
		
		if(city==null || country==null || state==null)
		{
			throw new IncorrectArgumentException("Incorrect Argument Exception!");
		}
		if(city.isEmpty() || state.isEmpty() || country.isEmpty())
		{
			throw new IncorrectArgumentException("Incorrect Argument Exception!");
		}
		if(countryNames.contains(country) || cityNames.contains(city) || stateNames.contains(state))
		{
			throw new IncorrectArgumentException("Incorrect Argument Exception!");
		}
		
	}
	
	static  public List<String> cities()
	{
		
		cityNames.add("Bhopal");
		cityNames.add("Indore");
		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Pune");
		
		return cityNames;
		
	}
	
	static public List<String> states()
	{
		
		stateNames.add("Madhya Pradesh");
		stateNames.add("Delhi");
		stateNames.add("Mumbai");
		stateNames.add("Pune");
		
		return stateNames;
		
	}
	
	public  static List<String> countries()
	{
		
		countryNames.add("India");
		countryNames.add("Australia");
		countryNames.add("Pakistan");
		countryNames.add("India");
		countryNames.add("England");
		
		return countryNames;
		
	}
	
	public static void validUserId(String userId)
	{
		if(userId==null)
		{
			throw new IncorrectArgumentException("Incorrect Argument Exception!");
		}
		if(userId.isEmpty())
		{
			throw new IncorrectArgumentException("Incorrect Argument Exception!");
		}
	}
	

}
