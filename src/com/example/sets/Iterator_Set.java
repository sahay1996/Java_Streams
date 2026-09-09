package com.example.sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iterator_Set {

	public static void main(String[] args) {
		Set<Payment> sets = new TreeSet<>();
		sets.add(new Payment("REF5488"));
		sets.add(new Payment("AB123"));
		sets.add(new Payment("161B288"));
		sets.add(new Payment("REF5488"));
		
		
		Iterator<Payment> itr = sets.iterator();
		
		while(itr.hasNext())
		{
			Payment p = itr.next();
			System.out.println("Payment id is : "+p.refId);
		}
		
	}

}
