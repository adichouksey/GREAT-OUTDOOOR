package com.capgemini.go.dao;

import java.net.ConnectException;
import java.util.*;
import com.capgemini.go.exception.GoAdminException;
//import the packages of View calsses
public interface GoAdminReportsDao {
	
	// change View in list by calss name of viewSalesReportByUserAndCategory and viewDetailedSalesReportByProduct these methods
	List<View> viewSalesReportByUserAndCategory(Date entry, Date exit, String TargetuserId,
			int category) throws GoAdminException, ConnectException;


	List<View> viewDetailedSalesReportByProduct(Date entry, Date exit, int cat)
			 throws GoAdminException;

}