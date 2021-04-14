package com.abcproduct.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Product {

    private Integer productId;
    private String productName;
    private Integer productPrice;

}