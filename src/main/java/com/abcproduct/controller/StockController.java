package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.repository.StockRepository;

//@Controller
@RestController
public class StockController {

	@Autowired
	private StockRepository mapper;

	@GetMapping("/stock")
	public List<Stock> getStockList(Model model) {
		List<Stock> stock = mapper.selectStockList();
		model.addAttribute("stock", stock);
		return stock;
	}

	@GetMapping("/stock/{product_id}")
	public List<Stock> getStock(@PathVariable("product_id") int product_id, Model model) {
		List<Stock> stock = mapper.selectStockId(product_id);
		model.addAttribute("stock", stock);
		return stock;
	}

}