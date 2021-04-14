package com.abcproduct.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Warehouse {

    private Integer warehouseId;
    private String warehouseName;
    private String warehouseAddress;

}