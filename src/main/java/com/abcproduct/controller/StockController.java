package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.paging.Criteria;
import com.abcproduct.domain.repository.StockRepository;

//@Controller
@RestController
public class StockController {

	@Autowired
	private StockRepository mapper;

	@GetMapping("/stock")
	public List<Stock> getStock(@ModelAttribute("criteria")Criteria criteria , Model model) {
		List<Stock> stock = mapper.selectStockList(criteria);
		model.addAttribute("stock", stock);
		System.out.println(stock);
		return stock;
	}

	@GetMapping("/detail")
	public List<Stock> getDetail(@ModelAttribute("criteria")Criteria criteria , Model model) {
		List<Stock> stock = mapper.selectStockList(criteria);
		model.addAttribute("stock", stock);
		System.out.println(stock);
		return stock;
	}

}