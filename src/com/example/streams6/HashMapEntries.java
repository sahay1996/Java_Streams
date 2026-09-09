package com.example.streams6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntries {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Karnataka", "BLR");
		map.put("Bihar", "Patna");
		map.put("Haryana", "Chandigarh");
		map.put("Punjab", "Chandigarh");
		map.put("India", "Delhi");
		map.put("Maharastra", "Mumbai");
		
		Set<Map.Entry<String, String>> mapSet = map.entrySet();
		
		Iterator<Map.Entry<String, String>> itr = mapSet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> entries = itr.next();
			System.out.println("Keys are : "+entries.getKey()+""
					+ " Values are : "+entries.getValue());
		}
	}

}
