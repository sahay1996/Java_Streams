package com.example.streams3;
import java.util.*;
import java.util.stream.Collectors;
public class Length_Strings {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR", "HYD", "PUNE", "CHENNAI");
		List<Integer> lengths = cities.stream().map(w->w.length()).collect(Collectors.toList());
		System.out.println("Length of each string are : "+lengths);
	}

}
