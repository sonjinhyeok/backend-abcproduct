package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import com.abcproduct.domain.model.Stock;

@Mapper
public interface StockRepository {

	public List<Stock> selectStockList();

	public List<Stock> selectStock(@PathVariable("productId") int productId);

	public int selectStockTotalCount();

}