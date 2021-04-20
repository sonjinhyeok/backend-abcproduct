package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.abcproduct.domain.model.Stock;

@Mapper
public interface StockRepository {

	public List<Stock> selectStockList();

	public List<Stock> selectStockId(@Param("product_id") int product_id);

	public int selectStockTotalCount();

}