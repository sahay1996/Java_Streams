package com.example.comparableInterface;

import java.util.Comparator;

public class ComparatorName implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int value = o1.name.compareTo(o2.name);
		return value;
		
	}

}
