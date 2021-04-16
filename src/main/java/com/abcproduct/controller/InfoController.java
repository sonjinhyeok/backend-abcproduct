package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.Info;
import com.abcproduct.domain.model.InfoExample;
import com.abcproduct.domain.repository.InfoRepository;

@Controller
public class InfoController {

	@Autowired
	private InfoRepository mapper;
	private InfoExample example;

	@GetMapping("/")
	public String getInfo(Model model) {
		List<Info> info = mapper.selectByExample(example);
		model.addAttribute("info", info);
		return "index";
	}

}