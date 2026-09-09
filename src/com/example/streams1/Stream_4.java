package com.example.streams1;

import java.util.Arrays;
import java.util.List;

public class Stream_4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,17,19,23,55,66,69,70,74,8,84);
		numbers.stream().filter(w-> w%2!=0).forEach(w->System.out.println(w));
	}

}
