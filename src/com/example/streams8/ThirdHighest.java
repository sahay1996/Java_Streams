package com.example.streams8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class ThirdHighest {

	public static void main(String[] args) {
		List<Integer> salary = Arrays.asList( 25000, 32000, 45000, 38000, 52000, 28000, 65000, 41000, 75000, 55000, 32000);
		Optional<Integer> thirdHS = salary.stream().distinct().sorted((a,b)->b-a).skip(2).findFirst();
		System.out.println(thirdHS.get());
	}

}
