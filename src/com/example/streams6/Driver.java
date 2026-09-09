package com.example.streams6;
import java.util.*;
import java.util.stream.Collectors;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Ashish", 50000, "IT"),
			    new Employee(102, "Rahul", 60000, "HR"),
			    new Employee(103, "Amit", 75000, "IT"),
			    new Employee(104, "John", 45000, "Sales"),
			    new Employee(105, "Anil", 90000, "IT"),
			    new Employee(106, "David", 55000, "Sales")
			);
		List<String> empNames = employees.stream().map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println("Employee Names are : "+empNames);
		List<String> salaryGreat60k = employees.stream().filter(emp->emp.getSalary()>60000).map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println("Employee whose salary is grater than 60k are as follows : "+salaryGreat60k);
		Optional<Employee> highestSalary = employees.stream().max(Comparator.comparingInt(Employee::getSalary));
		System.out.println("Highest Salary is : "+highestSalary);
		
		
	}

}
