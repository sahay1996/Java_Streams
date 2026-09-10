package com.example.practicequestions;

import java.util.*;
import java.util.stream.Collectors;
public class SalaryGreaterThan10 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Ashish", 12.5), new Employee("Rahul", 3.2),
				new Employee("Priya", 28.5), new Employee("Sneha", 7.8), new Employee("Arjun", 45.0),
				new Employee("Vikram", 15.5), new Employee("Neha", 2.1), new Employee("Kiran", 35.7),
				new Employee("Rohit", 9.5), new Employee("Anjali", 22.0), new Employee("Suresh", 5.4),
				new Employee("Pooja", 18.3), new Employee("Amit", 1.8), new Employee("Divya", 40.5),
				new Employee("Manoj", 11.2), new Employee("Varun", 4.6), new Employee("Kavya", 31.5),
				new Employee("Sanjay", 6.7), new Employee("Meena", 25.8), new Employee("Rakesh", 50.0));
		
		List<String> processedList = employees.stream().filter(emp->emp.salary>10.0).map(emp->emp.empName).collect(Collectors.toList());
		Iterator<String> itr = processedList.iterator();
		while(itr.hasNext())
		{
			String names = itr.next();
			System.out.println("Names of employees whose salary is greater than 10Lpa are : "+names);
		}

	}

}
