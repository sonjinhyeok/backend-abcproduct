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
	private StockRepository mapper;

	@GetMapping("")
	public String getProducts(Model model) {
		List<Stock> stock = mapper.selectInfo();
		model.addAttribute("stock", stock);
		return "index";
	}
}