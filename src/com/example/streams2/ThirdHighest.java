package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ThirdHighest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1001,20002,5666,8888,99999);
		Optional<Integer> optional = numbers.stream().filter(w->w%2==0).skip(2).findFirst();
		System.out.println(optional.get());
	}

}
