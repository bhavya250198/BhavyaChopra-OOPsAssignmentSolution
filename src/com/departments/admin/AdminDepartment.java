package com.departments.admin;

import com.departments.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Admin Department";
		return departmentName;
	}
    public String getTodaysWork() {
    	String todaysWork = "Complete your documents Submission";
    	return todaysWork;
    }
    public String getWorkDeadline() {
    	String deadline="Complete by EOD ";
    	return deadline;
    }
  
}
