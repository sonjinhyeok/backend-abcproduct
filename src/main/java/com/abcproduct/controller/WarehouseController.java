package com.abcproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.Warehouse;
import com.abcproduct.domain.repository.WarehouseRepository;

@Controller
public class WarehouseController {

	@Autowired
	private WarehouseRepository warehouseRepository;

	@GetMapping("/warehouse")
	public String getWarehouses(Model model) {
		Warehouse warehouse = warehouseRepository.selectByPrimaryKey(9001);

		model.addAttribute("warehouse", warehouse);

	    return "warehouse";
	}
}
