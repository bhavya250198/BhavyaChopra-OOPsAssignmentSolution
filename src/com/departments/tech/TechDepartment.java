package com.departments.tech;

import com.departments.superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Tech Department";
		return departmentName;
	}
    public String getTodaysWork() {
    	String todaysWork = "Complete coding of module 1";
    	return todaysWork;
    }
    public String getWorkDeadline() {
    	String deadline="Complete by EOD ";
    	return deadline;
    }
    public String getTechStackInformation() {
    	String info = "Core Java";
    	return info;
    }
}
