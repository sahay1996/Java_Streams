package com.example.streams4;
import java.util.*;
import java.util.stream.Collectors;
public class SortStringAlphabetically {

	public static void main(String[] args) {
		List<String> cities =
			    Arrays.asList("PUNE", "BLR", "HYD", "CHENNAI", "DELHI");
		List<String> output = cities.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List : "+output);
	}

}
