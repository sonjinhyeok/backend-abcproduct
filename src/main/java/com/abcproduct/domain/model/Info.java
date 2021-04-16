package com.abcproduct.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Info {

    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer stockCount;
    private String warehouseName;
}