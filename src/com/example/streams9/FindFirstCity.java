package com.example.streams9;

import java.util.Arrays;
import java.util.List;

public class FindFirstCity {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR","HYD","PUNE","PNBE","DEL","KOL","CHE","CH","CHITORGARH");
		cities.stream().filter(c->c.startsWith("C") & c.length()>3 ).limit(1).forEach(c->System.out.println(c));
		
	}

}
