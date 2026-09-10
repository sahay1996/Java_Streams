package com.example.comparableInterface;

import java.util.Comparator;

public class CustomComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int value = Integer.compare(o1.id, o2.id);
		return value;
	}

}
