package com.abcproduct.domain.model;

public class Stock {
    private int product_id;
    private String warehouse_id;
    private int stock_count;
    private Boolean stock_inl;
    private Boolean stock_out;

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public int getStock_count() {
		return stock_count;
	}
	public void setStock_count(int stock_count) {
		this.stock_count = stock_count;
	}
	public Boolean getStock_inl() {
		return stock_inl;
	}
	public void setStock_inl(Boolean stock_inl) {
		this.stock_inl = stock_inl;
	}
	public Boolean getStock_out() {
		return stock_out;
	}
	public void setStock_out(Boolean stock_out) {
		this.stock_out = stock_out;
	}


}
