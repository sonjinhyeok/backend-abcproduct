package com.abcproduct.domain.model;

public class Stock {
    private int product_id;
    private int warehouse_id;
    private int stock_count;
    private boolean stock_in;
    private boolean stock_out;

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public int getStock_count() {
		return stock_count;
	}
	public void setStock_count(int stock_count) {
		this.stock_count = stock_count;
	}
	public boolean getStock_in() {
		return stock_in;
	}
	public void setStock_in(boolean stock_in) {
		this.stock_in = stock_in;
	}
	public boolean getStock_out() {
		return stock_out;
	}
	public void setStock_out(boolean stock_out) {
		this.stock_out = stock_out;
	}
}