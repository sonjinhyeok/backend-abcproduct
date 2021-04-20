package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.paging.Criteria;

@Mapper
public interface StockRepository {

	public List<Stock> selectStockList(Criteria criteria);

	public int selectStockTotalCount(Criteria criteria);

}