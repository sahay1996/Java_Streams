package com.example.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two_D_One_D {

	public static void main(String[] args) {
		List<List<String>> cityNames = Arrays.asList(Arrays.asList("Agra", "Ahmedabad", "Agartala", "Alwar"),
				Arrays.asList("Bengaluru", "BOMBAY", "Bhagalpur"), Arrays.asList("Chennai", "Chandigarh"),
				Arrays.asList("Delhi", "Deharadun"));
		System.out.println("Two Dimensional Array : "+cityNames);
		List<String> oneDimensionalArray = cityNames.stream().flatMap(w->w.stream()).collect(Collectors.toList());
		List<String> sortedLists = oneDimensionalArray.stream().sorted((a,b)->b.length()-a.length()).collect(Collectors.toList());
		System.out.println("One Dimensional Array is : " +sortedLists);
	}

}
