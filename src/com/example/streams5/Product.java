package com.example.streams5;
import java.util.*;
public class Product {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 20, 30, 40, 50);
		Optional<Integer> product = numbers.stream().reduce((a,b)->a*b);
		System.out.println("Product of the list is : "+product.get());
	}

}
