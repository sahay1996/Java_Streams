package com.example.streams5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Third_Even_Highest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);//40 35 30 25 20 15 10
		Optional<Integer> result = numbers.stream().sorted((a,b)->b-a).filter(w->w%2==0).skip(2).findAny();
		System.out.println("Third Highest Number is : "+result.get());
	}

}
