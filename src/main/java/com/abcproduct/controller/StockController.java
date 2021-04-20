package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.paging.Criteria;
import com.abcproduct.domain.repository.StockRepository;

@Controller
public class StockController {

	@Autowired
	private StockRepository mapper;
	@GetMapping("")
	public String getStocks(@ModelAttribute("criteria")Criteria criteria , Model model) {
		List<Stock> stock = mapper.selectStockList(criteria);
		System.out.println(stock);
		model.addAttribute("stock", stock);
		return "index";
	}
}