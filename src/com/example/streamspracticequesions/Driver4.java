package com.example.streamspracticequesions;

import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub8
		String city = "Bangalore";
		Map<Object, Long> cities = city.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(cities);
		}

}
