package com.javafundamentals;

public class BugTracker {
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	boolean status;
	String assignedDeveloper;
	String updateAssignedDeveloper;

	public static void main(String[] args) {
		BugTracker bt=new BugTracker();
		bt.bugId=1;
		bt.applicationName="WebApplication";
		bt.bugTitle="bugTitle";
		bt.severity="High";
		bt.priority="Medium";
		bt.status=true;
		bt.assignedDeveloper="Nashitha";
		bt.getId();
		bt.getapplicationName();
		bt.getbugTitle();
		bt.getseverity();
		bt.getpriority();
		bt.getstatus();
		bt.getassignedDeveloper();
		bt.getupdateAssignedDeveloper(1,"Sindhu");
	}
	
	void getId() {
		System.out.println(bugId);
	}
	void getapplicationName() {
		System.out.println(applicationName);
	}
	void getbugTitle() {
		System.out.println(bugTitle);
	}
	void getseverity() {
		System.out.println(severity);
	}
	void getpriority() {
		System.out.println(priority);
	}
	void getstatus() {
		System.out.println(status);
	}
	void getassignedDeveloper() {
		System.out.println(assignedDeveloper);
	}
	void getupdateAssignedDeveloper(int bugId,String name) {
		updateAssignedDeveloper=name;
		System.out.println(updateAssignedDeveloper);
	}
	
	
	
	
	

}
