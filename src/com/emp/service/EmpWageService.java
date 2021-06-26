package com.emp.service;

public interface EmpWageService {
	
	void addCompany(String name, int empRatePerHrs, int noOfWorkingDays, int maxHrsPerMonth);
	
	void computeWage();
}
