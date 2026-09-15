package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatten_lists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

		List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 110, 120, 130, 140, 150, 160);
		List<List<Integer>> listOfList = Arrays.asList(list1,list2);
		listOfList.stream().flatMap(w->w.stream()).forEach(w->System.out.println(w));
	}

}
