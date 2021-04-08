package com.abcproduct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.repository.StockRepository;

@RestController
public class StockController {

	private StockRepository stockRepository;

	public StockController(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	//全体のデータ情報を照会する
	@GetMapping("/stock")
	public List<Stock> getStockList() {
		return stockRepository.getStockList();
	}

	//IDでデータ情報を照会する
	@GetMapping("/stock/{stock_id}")
	public Stock getStock(@PathVariable("stock_id") int stock_id) {
		return stockRepository.getStock(stock_id);
	}

	//データ生成
	@PostMapping("/stock/{stock_id}")
	public void insertStock(@PathVariable("product_id") int product_id,
							  @RequestParam("warehouse_id") String warehouse_id,
							  @RequestParam("stock_count") int stock_count,
							  @RequestParam("stock_in") boolean stock_in,
							  @RequestParam("stock_out") boolean stock_out) {

		stockRepository.insertStock(product_id, warehouse_id, stock_count, stock_in, stock_out);
	}

	//データ修正
	@PutMapping("/stock/{stock_id}")
	public void updateStock(@PathVariable("product_id") int product_id,
							  @RequestParam("warehouse_id") String warehouse_id,
							  @RequestParam("stock_count") int stock_count,
							  @RequestParam("stock_in") boolean stock_in,
							  @RequestParam("stock_out") boolean stock_out) {

		stockRepository.updateStock(product_id, warehouse_id, stock_count, stock_in, stock_out);
	}

	//データ削除
	@DeleteMapping("/stock/{stock_id}")
	public void deleteStock(@PathVariable("product_id") int product_id) {
		stockRepository.deleteStock(product_id);
	}

}
