package com.example.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_2 {
	public static void main(String[] args) {
		List<List<String>> cityNames = Arrays.asList(Arrays.asList("Agra", "Ahmedabad", "Agartala", "Alwar"),
				Arrays.asList("Bengaluru", "BOMBAY", "Bhagalpur"), Arrays.asList("Chennai", "Chandigarh"),
				Arrays.asList("Delhi", "Deharadun"));
		System.out.println("Two Dimensional Array : "+cityNames);

		List<String> twoD_oneD = cityNames.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("One Dimensional Array : " + twoD_oneD);
		
		twoD_oneD.stream().filter(w->w.startsWith("B") && w.length()>6).forEach(w->System.out.println("Names of the cities with B are as follows :"+w+" "));
	}
}
