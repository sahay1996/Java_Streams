package com.example.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> cities = Arrays.asList(Arrays.asList("BLR", "HYD", "CHE"), Arrays.asList("KOL", "DEL", "CHG"),
				Arrays.asList("PUNE", "PNBE", "MUM"), Arrays.asList("SURAT", "BHO", "INO"));
		//Flatten the list
		List<String> oneDCities = cities.stream().flatMap(c->c.stream()).collect(Collectors.toList());
		System.out.println("One D View are : "+oneDCities);
	}

}
