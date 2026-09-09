package com.example.sets;

public class Employee implements Comparable<Employee> {
	String empName;
	int empId;

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public int compareTo(Employee o) {
		int value = Integer.compare(this.empId, o.empId);

		return value;
	}

}
