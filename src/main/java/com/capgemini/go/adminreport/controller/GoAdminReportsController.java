package com.capgemini.go.adminreport.controller;

import com.capgemini.go.adminreport.service.GoAdminReportsService;

public class GoAdminReportsController {

	private GoAdminReportsService goAdminReportsService;

	public GoAdminReportsService getGoAdminReportsService() {
		return goAdminReportsService;
	}

	public void setGoAdminReportsService(GoAdminReportsService goAdminReportsService) {
		this.goAdminReportsService = goAdminReportsService;
	}
	
}
