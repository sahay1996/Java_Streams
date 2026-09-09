package com.example.streams3;
import java.util.*;
import java.util.stream.Collectors;
public class UpperCaseGeneration {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ashish", "rahul", "amit", "john");
		List<String> uppCase = names.stream().map(w->w.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper Case are : "+uppCase);
	}

}
