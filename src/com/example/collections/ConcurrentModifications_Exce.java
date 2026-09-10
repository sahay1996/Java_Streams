package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModifications_Exce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = new ArrayList<>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("PNBE");
		
		System.out.println(cities);
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext())
		{
			String elements = itr.next();
			System.out.println("Elements are : "+elements);
			//modifications
			itr.remove();	
		}
		System.out.println(cities);
	}

}
