package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("Java", "Python", "C++");
		Optional<String> optional = items.stream().findFirst();
		System.out.println("Optional Element : "+optional.get());
	}
}
