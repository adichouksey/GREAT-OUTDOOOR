package com.capgemini.go.service;

import java.net.ConnectException;
import java.util.Date;
import java.util.List;

import com.capgemini.go.dao.View;
import com.capgemini.go.exception.GoAdminException;

//import the packages of View calsses

public class GoAdminReportsServiceImpl implements GoAdminReportsService {

	public List<View> viewSalesReportByUserAndCategory(Date entry, Date exit, String TargetuserId, int category)
			throws GoAdminException, ConnectException {
		return null;
	}

	public List<View> viewDetailedSalesReportByProduct(Date entry, Date exit, int cat)
			throws GoAdminException, ConnectException {
		return null;
	}

}

//change View in list by calss name of viewSalesReportByUserAndCategory and viewDetailedSalesReportByProduct these methods
