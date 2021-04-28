package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.repository.StockRepository;

@CrossOrigin(allowedHeaders = "*")
@RestController
public class StockController {

	@Autowired
	private StockRepository mapper;

	// 全てのデータ
	@GetMapping("/stock")
	public List<Stock> getStockList() {
		List<Stock> stock = mapper.selectStockList();
		return stock;
	}

	// IDごとのデータ
	@GetMapping("/stock/detail/{productId}")
	public List<Stock> getStock(@PathVariable("productId") int productId) {
		List<Stock> stock = mapper.selectStock(productId);
		return stock;
	}

	// 検索
	@GetMapping("/stock/{keyword}")
	public List<Stock> getSearchStock(@PathVariable("keyword") String keyword) {
		List<Stock> stock = mapper.stockSearch(keyword);
		return stock;
	}

	// 削除
	@DeleteMapping("/stock/detail/{productId}")
	public int getDeleteStock(@PathVariable("productId") int productId) {
		return mapper.deleteStock(productId);
	}

	// 登録
	@PostMapping("/stock/add")
	public int insertStock(Stock stock) {
		return mapper.insertStock(stock);
	}
}