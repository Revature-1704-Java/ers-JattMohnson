package com.revature.ERS;

public class Employee
{
	public int empID;
	public String empName;
	
	public Employee(int empID, String empName) 
	{
		super();
		this.empID = empID;
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
