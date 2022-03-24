package com.departments.hr;

import com.departments.superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Hr Department";
		return departmentName;
	}
    public String getTodaysWork() {
    	String todaysWork = "Fill today’s worksheet and mark your attendance";
    	return todaysWork;
    }
    public String getWorkDeadline() {
    	String deadline="Complete by EOD ";
    	return deadline;
    }
    public String doActivity() {
    	String activity = "Team Lunch";
    	return activity;
    }
}
