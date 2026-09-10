package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("PNBE");
		System.out.println(cities);

		Iterator<String> itr = cities.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println("Elements are :" + element);
			if (element.equals("PNBE")) {
				itr.remove();
			}
		}
		System.out.println("Cities after removing are : " + cities);
	}

}
