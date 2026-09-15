package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Strings_By_Length {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "level", "orange", "madam", "java", "spring", "radar",
				"python", "apple", "hello", "world", "civic", "banana", "programming", "kayak", "developer", "level",
				"backend", "refer");
		Map<Object, List<String>> grouping = words.stream().distinct().sorted()
				.collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(grouping);
	}

}
