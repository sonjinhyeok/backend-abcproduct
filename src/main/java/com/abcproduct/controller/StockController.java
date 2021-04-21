package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.repository.StockRepository;

//@Controller
@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StockRepository mapper;

	@GetMapping("")
	public List<Stock> getStockList(Model model) {
		List<Stock> stock = mapper.selectStockList();
		model.addAttribute("stock", stock);
		return stock;
	}

	@GetMapping("/detail")
	public List<Stock> getStock(@RequestParam("productId") int productId, Model model) {
		List<Stock> stock = mapper.selectStockId(productId);
		model.addAttribute("stock", stock);
		return stock;
	}

}