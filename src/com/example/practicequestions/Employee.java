package com.example.practicequestions;

public class Employee {
	String empName;
	double salary;
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
