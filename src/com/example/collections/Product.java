package com.example.collections;

public class Product implements Comparable<Product> {
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		int value =  this.productName.compareTo(o.productName);
		if(value == 0)
		{
			return Integer.compare(this.productId, o.productId);
		}
		return value;
	}
	
	
}
