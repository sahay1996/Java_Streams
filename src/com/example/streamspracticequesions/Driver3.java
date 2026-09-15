package com.example.streamspracticequesions;

import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {

	public static void main(String[] args) {
		String input = "Hello";
		List<Character> output = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(output);
	}

}
