package com.example.streams4;
import java.util.*;
public class SecondHighest {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 50, 30, 90, 70, 90, 20);
		Optional<Integer> optional = numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findAny();
		System.out.println("Second highest Number is : "+optional.get());
		
	}

}
