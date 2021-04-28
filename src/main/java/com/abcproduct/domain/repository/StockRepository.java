package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.abcproduct.domain.model.Stock;

@Mapper
public interface StockRepository {

	// GET
	public List<Stock> selectStockList();

	// ID GET
	public List<Stock> selectStock(int productId);

	// SEARCH
	public List<Stock> stockSearch(String keyword);

	// DELETE
	public int deleteStock(int productId);

	// POST
	public int insertStock(Stock stock);

}