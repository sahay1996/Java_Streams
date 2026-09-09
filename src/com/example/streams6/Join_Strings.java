package com.example.streams6;
import java.util.*;
import java.util.stream.Collectors;
public class Join_Strings {

	public static void main(String[] args) {
		List<String> cities =
			    Arrays.asList("BLR", "HYD", "PUNE", "CHE");
		String joinedStrings = cities.stream().collect(Collectors.joining("-"));
		System.out.println("Joined Strings : "+joinedStrings);
	}

}
