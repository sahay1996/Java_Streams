package com.example.streams4;
import java.util.*;
public class CheckNumberGreater_100 {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(11, 13, 17, 20, 22, 30,105);
		Optional<Integer> value = numbers.stream().filter(w->w>100).findAny();
		System.out.println(value.get());
	}

}
