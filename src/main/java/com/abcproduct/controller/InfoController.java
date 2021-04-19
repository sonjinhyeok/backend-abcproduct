package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abcproduct.domain.model.Info;
import com.abcproduct.domain.model.InfoExample;
import com.abcproduct.domain.repository.InfoRepository;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
public class InfoController {

	@Autowired
	private InfoRepository mapper;
	private InfoExample example;

	@GetMapping("")
	public String getInfo(@RequestParam(required = false, defaultValue = "1") int pageNum, Model model) {
		List<Info> info = mapper.selectByExample(example);
		model.addAttribute("info", info);

		PageHelper.startPage(pageNum,5);
		Page<Info> pages = mapper.selectAll();
		model.addAttribute("pages", pages);

		return "index";
	}
}