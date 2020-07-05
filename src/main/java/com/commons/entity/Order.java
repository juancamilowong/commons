package com.commons.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.commons.entity.Product;

public class Order {
	
	private int clientId;
	
	private Date date;
	
	private String direction;
	
	private List<Product> products = new ArrayList<>();

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [clientId=" + clientId + ", date=" + date + ", direction=" + direction + ", products=" + products
				+ "]";
	}
	
}
