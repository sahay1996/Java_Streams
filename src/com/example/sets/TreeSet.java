package com.example.sets;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {
		Set<Employee> set = new java.util.TreeSet<>();
		set.add(new Employee("Ashish", 161300));
		set.add(new Employee("Kumar", 161289));
		set.add(new Employee("Sahay", 161290));
		set.add(new Employee("David", 161291));
		
		for (Employee employee : set) {
			System.out.println("Employee Name is : "+employee.empName+" Employee Id is : "+employee.empId);
		}
	}

}
