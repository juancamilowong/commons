package com.commons.entity;

public class OrderWrapper {
	
	private Order order;
	
	private BillInfo billInfo;

	public OrderWrapper() {
		super();
	}

	public OrderWrapper(Order order, BillInfo billInfo) {
		super();
		this.order = order;
		this.billInfo = billInfo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public BillInfo getBillInfo() {
		return billInfo;
	}

	public void setBillInfo(BillInfo billInfo) {
		this.billInfo = billInfo;
	}
	
	
	
}
