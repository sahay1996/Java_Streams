package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Collections {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("CHE");
		cities.add("DEL");
		cities.add("PNBE");
		Collections.sort(cities);
		System.out.println("Cities are : "+cities);
		List<String> unModifiablelist = Collections.unmodifiableList(cities);
		System.out.println("UnModifiable list is : "+unModifiablelist);
	  //unModifiablelist.add("BOM");
		System.out.println("Added Elements : "+unModifiablelist);
		List<String> syncList = Collections.synchronizedList(cities);
		System.out.println("Synchrozied List is : "+syncList);
		syncList.add("BHU");
		System.out.println("Synchrozied List is : "+syncList);
		
	}

}
