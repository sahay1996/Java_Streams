package com.example.streamspracticequesions;

import java.util.Optional;

public class Non_Repeated_Character {
	public static void main(String[] args) {
		String name = "swiss";
		Optional<Character> output = name.chars().mapToObj(n -> (char) n)
				.filter(n -> name.indexOf(n) == name.lastIndexOf(n)).findFirst();
		String firstName_SecondName = "Ashish Kumar Sahay";
		Optional<Character> output1 = firstName_SecondName.toLowerCase().chars().mapToObj(ch -> (char) ch)
				.filter(ch -> firstName_SecondName.indexOf(ch) == firstName_SecondName.lastIndexOf(ch)).findFirst();

		System.out.println(output1.get());
	}
}
