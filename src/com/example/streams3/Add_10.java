package com.example.streams3;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Add_10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		List<Integer> add10 = numbers.stream().map(w->w+10).collect(Collectors.toList());
		System.out.println("Addition of 10 in the list : "+add10);
	}

}
