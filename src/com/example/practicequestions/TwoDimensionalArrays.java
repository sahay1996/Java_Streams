package com.example.practicequestions;
import java.util.*;
import java.util.stream.Collectors;
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		 List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
		            Arrays.asList(1, 2, 3),
		            Arrays.asList(4, 5, 6),
		            Arrays.asList(7, 8, 9)
		        ));
		 List<Integer> oneDimensionalArray = matrix.stream().flatMap(w->w.stream()).collect(Collectors.toList());
		 System.out.println(oneDimensionalArray);
	}

}
