package com.example.practicequestions;

import java.util.*;
import java.util.stream.Collectors;

public class ProductPriceGreater1k {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Pen", 10), new Product("Pencil Box", 50),
				new Product("Notebook", 80), new Product("Water Bottle", 250), new Product("Mouse Pad", 350),
				new Product("USB Cable", 450), new Product("Keyboard", 800), new Product("Mouse", 1200),
				new Product("Headphones", 1800), new Product("Power Bank", 2500),
				new Product("Bluetooth Speaker", 3200), new Product("Smart Watch", 4500),
				new Product("External Hard Disk", 5500), new Product("SSD", 6500), new Product("Monitor", 7500),
				new Product("Printer", 8200), new Product("Mechanical Keyboard", 9000), new Product("Webcam", 9500),
				new Product("Gaming Mouse", 9800), new Product("Tablet", 10000));
		List<String> productNamesGreaterthan1k = products.stream().filter(pro -> pro.getPriceOfProduct() > 1000)
				.map(pro -> {
					double discount = pro.priceOfProduct - 0.10 * pro.priceOfProduct;
					return pro.productName + " " + discount;
				}).collect(Collectors.toList());
		Iterator<String> itr = productNamesGreaterthan1k.iterator();
		while (itr.hasNext()) {
			String p = itr.next();
			System.out.println("Product Name & price after discount is :" + p);
		}
	}

}
