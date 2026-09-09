package com.example.streams5;
import java.util.*;
import java.util.stream.Collectors;
public class Convert_List_Set {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 20, 10, 30, 20, 40);
		Set<Integer> set = numbers.stream().collect(Collectors.toSet());
		System.out.println(set);
	}

}
