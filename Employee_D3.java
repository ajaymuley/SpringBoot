package com.entity;

public class Employee_D3 {
	int empid;
	String empname;
	String dept;

	public Employee_D3() {
		super();
	}

	public Employee_D3(int empid, String empname, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
