package com.example.streams1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_7 {

	public static void main(String[] args) {
		List<List<String>> cities = (Arrays.asList(Arrays.asList("Delhi", "Noida", "Gurgaon"), // North
				Arrays.asList("Mumbai", "Pune", "Nagpur"), // West
				Arrays.asList("Bengaluru", "Mysuru", "Mangaluru", "Mumbai", "Pune", "Nagpur")));
		HashSet<String> hashSet = new HashSet<>();
		List<String> output = cities.stream().flatMap(w->w.stream()).filter(w->!hashSet.add(w)).collect(Collectors.toList());
		System.out.println("List from the processed lists : "+output);
	}

}
