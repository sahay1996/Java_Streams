package com.example.streams4;
import java.util.*;
public class FirstEvenNo {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(11, 13, 17, 20, 22, 30);
		Optional<Integer> firstEven = numbers.stream().filter(w->w%2==0).findAny();
		System.out.println(firstEven.get());
	}

}
