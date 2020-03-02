package com.capgemini.go.wishlistmanagementsystem.entities;
import java.util.*;

public class UserWishes {
	private Set<String>products=new LinkedHashSet<>();
	
       public Set<String>getProducts(){
    	   return products;
       }
    
}
