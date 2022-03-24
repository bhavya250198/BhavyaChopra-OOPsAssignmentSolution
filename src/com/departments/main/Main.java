package com.departments.main;

import com.departments.admin.AdminDepartment;
import com.departments.hr.HrDepartment;
import com.departments.tech.TechDepartment;

public class Main {
	public static void showAdmin() {
		AdminDepartment admin = new AdminDepartment();
		String adminDetails = "Welcome to "+admin.departmentName();
		System.out.println(adminDetails);
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
	}
	public static void showHr() {
		HrDepartment hr = new HrDepartment();
		String hrDetails = "Welcome to "+hr.departmentName();
		System.out.println(hrDetails);
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
	}
   public static void showTech() {
	   TechDepartment techie = new TechDepartment();
		String techDetails= "Welcome to "+techie.departmentName();
		System.out.println(techDetails);
		System.out.println(techie.getTodaysWork());
		System.out.println(techie.getWorkDeadline());
		System.out.println(techie.getTechStackInformation());
		System.out.println(techie.isTodayAHoliday());
   }
	public static void show() {
		showAdmin();
		showHr();
		showTech();
		
	}
	public static void main (String args[]) {
		
	 show();
		
	}
}
