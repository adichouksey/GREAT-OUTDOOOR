package com.capgemini.go.controller;

import com.capgemini.go.service.GoAdminReportsService;

public class GoAdminReportsController {

	private GoAdminReportsService goAdminReportsService;

	public GoAdminReportsService getGoAdminReportsService() {
		return goAdminReportsService;
	}

	public void setGoAdminReportsService(GoAdminReportsService goAdminReportsService) {
		this.goAdminReportsService = goAdminReportsService;
	}
	
}
