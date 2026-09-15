package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "level", "orange", "madam", "java", "spring", "radar",
				"python", "apple", "hello", "world", "civic", "banana", "programming", "kayak", "developer", "level",
				"backend", "refer");
		//freq of the words
	 Map<Object, Long> obj =words.stream().distinct().collect(Collectors.groupingBy(w->w,Collectors.counting()));
	 System.out.println(obj);
	}

}
