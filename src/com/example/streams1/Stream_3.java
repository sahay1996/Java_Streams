package com.example.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 332, 12, 55, 7, 97, 45, 66);
		numbers.stream().filter(w->w%2==0).map(w->w*10).forEach(w->System.out.println(w));
	}
}
