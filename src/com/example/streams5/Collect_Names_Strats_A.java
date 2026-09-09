package com.example.streams5;
import java.util.*;
import java.util.stream.Collectors;
public class Collect_Names_Strats_A {

	public static void main(String[] args) {
		List<String> cities =
			    Arrays.asList("BLR", "HYD", "PUNE", "CHE","AHM","AGRA","AJMER");
		List<String> collectCities = cities.stream().filter(w->w.startsWith("A")).collect(Collectors.toList());
		System.out.println("Cities collected are : "+collectCities);
		
	}

}
