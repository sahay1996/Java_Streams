package com.example.practicequestions;
import java.util.*;
import java.util.stream.Collectors;
public class TwoDimensionalStrings {

	public static void main(String[] args) {
		 List<List<String>> matrix = new ArrayList<>(Arrays.asList(
		            new ArrayList<>(Arrays.asList("Apple", "Banana")),
		            new ArrayList<>(Arrays.asList("Carrot", "Donut", "Egg")),
		            new ArrayList<>(Arrays.asList("Fish"))
		        ));
		 System.out.println("2 dimensional View : "+matrix);
		 List<String> processedList = matrix.stream().flatMap(w->w.stream()).collect(Collectors.toList());
		 System.out.println("Processed List is : "+processedList);
	}

}
