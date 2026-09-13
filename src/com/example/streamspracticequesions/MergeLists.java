package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeLists {

	public static void main(String[] args) {
		List<String> states = Arrays.asList("Karnataka", "Maharashtra", "Tamil Nadu", "Kerala", "Andhra Pradesh",
				"Telangana", "Gujarat", "Rajasthan", "Punjab", "Haryana", "West Bengal", "Bihar", "Odisha", "Assam",
				"Uttar Pradesh", "Madhya Pradesh", "Karnataka", "Maharashtra", "Kerala", "Gujarat", "Tamil Nadu",
				"Rajasthan", "Punjab", "Karnataka");
		states.stream().sorted().forEach(w -> System.out.println(w));
		Map<Object, Long> statesare = states.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println("States are : "+statesare);
		Set<String> statesSet = new HashSet<>();
		states.stream().filter(s->!statesSet.add(s)).forEach(w->System.out.print(" States are :"+w));
	}

}
