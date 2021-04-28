package com.abcproduct.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Product {

    private int productId;
    private String productName;
    private int productPrice;

}