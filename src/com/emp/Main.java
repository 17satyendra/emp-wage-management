package com.emp;

import com.emp.service.EmpWageService;
import com.emp.service.EmpWageServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Emp management");
		EmpWageService service = new EmpWageServiceImpl();
		service.addCompany("DMart", 20, 20, 100);
		service.addCompany("JioMart", 30, 18, 100);
		service.computeWage();
	}
}
