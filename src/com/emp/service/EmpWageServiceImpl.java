package com.emp.service;

import java.util.Random;

import com.emp.models.Company;

public class EmpWageServiceImpl implements EmpWageService {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;	
	
	private int noOfCompany = 0;
	
	private Company [] companies; 
	
	public EmpWageServiceImpl() {
		companies = new Company[5];
	}
	
	@Override
	public void addCompany(String name, int empRatePerHrs, int noOfWorkingDays, int maxHrsPerMonth){
		companies[noOfCompany++] = new Company(name, empRatePerHrs, noOfWorkingDays, maxHrsPerMonth);	
	}
	
	@Override
	public void computeWage() {
		
		for (int i = 0; i < noOfCompany; i++) {	
			companies[i].setTotalEmpWage(computeWage(companies[i]));
			computeWage(companies[i]);
			System.out.println(companies[i]);
		}
	}
	
	/**
	 * Total wage
	 * @param company
	 * @return total wage.
	 */
	private int computeWage(Company company) {
		int dailyHour = 0, totalEmpHour = 0, totalWorkingDays = 0;	
		while(totalEmpHour<=company.getMaxHrsPerMonth() &&totalWorkingDays<=company.getNoOfWorkingDays()){
			final int empCheck = new Random().nextInt(3);
			totalWorkingDays++;
			switch(empCheck){
				case IS_FULL_TIME:
					dailyHour = 8;
					break;
				case IS_PART_TIME:
					dailyHour =  4;
					break;
				default:
					break;
			}
			totalEmpHour+=dailyHour;
		}
		int totalEmpWage = totalEmpHour * company.getEmpRatePerHrs();
		return totalEmpWage;
	}

}
