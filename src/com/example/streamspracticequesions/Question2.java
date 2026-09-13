package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Bangalore",null,null,null,"Chennai", "Delhi", "Pune", "Mumbai", "Mysore", "Hyderabad");
		city.stream().filter(w->w!=null).forEach(w->System.out.println(w));
	}

}
