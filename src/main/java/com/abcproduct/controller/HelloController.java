package com.abcproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.Testitem;
import com.abcproduct.domain.repository.TestitemRepository;

@Controller
public class HelloController {

	@Autowired
	private TestitemRepository testitemRepository;

	@GetMapping("")
	public String hello(Model model) {
		Testitem testitem1 = testitemRepository.selectByPrimaryKey(1);

		model.addAttribute("testitem1", testitem1);

	    model.addAttribute("greeting", "Hello, World!");
	    return "hello";
	}
}
