package com.abcproduct.domain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Stock {

    private Integer productId;
    private Integer warehouseId;
    private Integer stockCount;
    private boolean stockIn;
    private boolean stockOut;

    /** 子要素を持つ */
    private List<Product> products;
    private List<Warehouse> warehouses;
}