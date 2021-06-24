package com.emp;

import java.util.Random;

public class Main {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private static final int maxHoursPerMonth = 100;
	private static final int EMP_RATE_PER_HRS = 20;
	private static final int NO_OF_WORKING_DAYS = 20;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Emp management");
		int totalWage = computeWage();
		System.out.println("TotalWage : "+ totalWage);
	}
	
	/**
	 * Total wage
	 * @param company
	 * @return total wage.
	 */
	private static int computeWage() {
		int dailyHour = 0, totalEmpHour = 0, totalWorkingDays = 0;	
		while(totalEmpHour<=maxHoursPerMonth &&totalWorkingDays<=NO_OF_WORKING_DAYS){
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
		int totalEmpWage = totalEmpHour * EMP_RATE_PER_HRS;
		return totalEmpWage;
	}

}
