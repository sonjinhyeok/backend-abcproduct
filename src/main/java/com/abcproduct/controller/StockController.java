package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.repository.StockRepository;

@Controller
public class StockController {

	@Autowired
	private StockRepository stockRepository;

	//全体のデータ情報を照会する
	@GetMapping("/stock")
	public List<Stock> getStockList(Model model) {
		List<Stock> stockList = stockRepository.getStockList();
		model.addAttribute("stockList", stockList);
		return stockList;
	}

//	//全体のデータ情報を照会する
//	@GetMapping("/stock")
//	public List<Stock> getStockList() {
//		return stockRepository.getStockList();
//	}

//	//IDでデータ情報を照会する
//	@GetMapping("/stock/{product_id}")
//	public Stock getStock(@PathVariable("product_id") int product_id) {
//		return stockRepository.getStock(product_id);
//	}
//
//	//データ生成
//	@PostMapping("/stock/{product_id}")
//	public void insertStock(@PathVariable("product_id") int product_id,
//							@RequestParam("warehouse_id") int warehouse_id,
//							@RequestParam("stock_count") int stock_count,
//							@RequestParam("stock_in") boolean stock_in,
//							@RequestParam("stock_out") boolean stock_out) {
//
//		stockRepository.insertStock(product_id, warehouse_id, stock_count, stock_in, stock_out);
//	}
//
//	//データ修正
//	@PutMapping("/stock/{product_id}")
//	public void updateStock(@PathVariable("product_id") int product_id,
//							@RequestParam("warehouse_id") int warehouse_id,
//							@RequestParam("stock_count") int stock_count,
//							@RequestParam("stock_in") boolean stock_in,
//							@RequestParam("stock_out") boolean stock_out) {
//
//		stockRepository.updateStock(product_id, warehouse_id, stock_count, stock_in, stock_out);
//	}
//
//	//データ削除
//	@DeleteMapping("/stock/{product_id}")
//	public void deleteStock(@PathVariable("product_id") int product_id) {
//		stockRepository.deleteStock(product_id);
//	}
}