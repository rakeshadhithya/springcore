package com.rakesh.springcore;

public class ProductImpl implements Product {
	
	String product;
	
	
	public ProductImpl() {
		
	}
	
	public ProductImpl(String product) {
		this.product = product;
	}
	
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getProduct() {
		return this.product;
	}
}
