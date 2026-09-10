package com.example.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//External Sorting
public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(101, "Ashish");
		Customer c2 = new Customer(501, "Kumar");
		Customer c3 = new Customer(601, "Sahay");
		Customer c4 = new Customer(201, "David");
		List<Customer> customer = new ArrayList<Customer>();
		customer.add(c4);
		customer.add(c3);
		customer.add(c2);
		customer.add(c1);
		Collections.sort(customer,new ComparatorName());
		
		Iterator<Customer> itr = customer.iterator();
		while(itr.hasNext())
		{
			Customer custom = itr.next();
			System.out.println("Customer id is : "+custom.id+""
					+ " Customer Name is : "+custom.name);
		}
	}

}
