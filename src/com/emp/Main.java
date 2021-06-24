package com.emp;

import java.util.Random;

public class Main {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;	

	public static void main(String[] args) {
		System.out.println("Welcome to Emp management");
		computeWage("DMart", 20, 20, 100);
		computeWage("JioMart", 30, 18, 100);
	}
	
	/**
	 * Total wage
	 * @param company
	 * @return total wage.
	 */
	private static int computeWage(String name, int empRatePerHrs, int noOfWorkingDays, int maxHrsPerMonth) {
		int dailyHour = 0, totalEmpHour = 0, totalWorkingDays = 0;	
		while(totalEmpHour<=maxHrsPerMonth &&totalWorkingDays<=noOfWorkingDays){
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
		int totalEmpWage = totalEmpHour * empRatePerHrs;
		
		System.out.println("Total Emp wage for company: "+ name + " is : "+ totalEmpWage);
		return totalEmpWage;
	}

}
