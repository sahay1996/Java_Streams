package com.example.streams1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Streams_1 {
	public static void main(String[] args) {
		ArrayList<String> product = new ArrayList<>();
		product.add("Phone");
		product.add("Tablet");
		product.add("Laptop");
		product.add("Earphones");
		product.add("Ipad");
		
		ArrayList<String> finalProducts = (ArrayList<String>) product.stream().map(w->w.toUpperCase()).collect(Collectors.toList());
		System.out.println("Final Products :"+finalProducts);
		
		ArrayList<String> processedProducts = (ArrayList<String>) product.stream().filter(w->w.startsWith("T")).collect(Collectors.toList());
		System.out.println("Processed Products : "+processedProducts);
	}
}
