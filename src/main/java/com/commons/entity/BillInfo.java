package com.commons.entity;

public class BillInfo {
	
	public static double TAX_VALUE = 0.19; 
	
	private double total;
	
	private double tax;
	
	private double grandTotal;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "BillInfo [total=" + total + ", tax=" + tax + ", grandTotal=" + grandTotal + "]";
	}
	
	
}
