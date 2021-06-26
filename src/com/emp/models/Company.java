package com.emp.models;

public class Company {
	
	private String name;
	private int empRatePerHrs;
	private int noOfWorkingDays;
	private int maxHrsPerMonth;
	private int totalEmpWage;
	
	public Company(final String name, final int empRatePerHrs, final int noOfWorkingDays, final int maxHrsPerMonth) {
		super();
		this.name = name;
		this.empRatePerHrs = empRatePerHrs;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpRatePerHrs() {
		return empRatePerHrs;
	}
	public void setEmpRatePerHrs(int empRatePerHrs) {
		this.empRatePerHrs = empRatePerHrs;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getMaxHrsPerMonth() {
		return maxHrsPerMonth;
	}
	public void setMaxHrsPerMonth(int maxHrsPerMonth) {
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString(){
		return "Total wage of employee of company " + this.name + " is: "+this.totalEmpWage;
	}

}
