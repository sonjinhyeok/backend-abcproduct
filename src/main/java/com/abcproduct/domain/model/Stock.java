package com.abcproduct.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Stock {

    private int productId;
    private int warehouseId;
    private int stockCount;
    private boolean stockIn;
    private boolean stockOut;

    /** 子要素を持つ */
    private Product products;
    private Warehouse warehouses;
}