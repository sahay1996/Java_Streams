package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparable_Interface {

	public static void main(String[] args) {
		Product p1 = new Product(1011, "Iphone");
		Product p2 = new Product(11, "Samsung Ultra");
		Product p3= new Product(1, "Realme");
		Product p4 = new Product(1000011, "Nokia");
		Product p5 = new Product(98, "Moto G7");
		Product p6 = new Product(98, "BlackBerry");
		Product p7 = new Product(107, "ZebPhone");
		List<Product> products = new ArrayList<>();
		products.add(p7);
		products.add(p6);
		products.add(p5);
		products.add(p4);
		products.add(p3);
		products.add(p2);
		products.add(p1);
		Collections.sort(products);
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext())
		{
			Product p = itr.next();
			System.out.println("Product id is :"+p.productId+""
					+ " Product name is : "+p.productName);
		}
	}

}
