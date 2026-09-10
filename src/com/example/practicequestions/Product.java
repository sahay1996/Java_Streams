package com.example.practicequestions;

public class Product {
	String productName;
	int priceOfProduct;
	public Product(String productName, int priceOfProduct) {
		super();
		this.productName = productName;
		this.priceOfProduct = priceOfProduct;
	}
	public String getProductName() {
		return productName;
	}
	public int getPriceOfProduct() {
		return priceOfProduct;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", priceOfProduct=" + priceOfProduct + "]";
	}
	
	
}
