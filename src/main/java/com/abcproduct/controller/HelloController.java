package com.abcproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.TestItemModel;
import com.abcproduct.domain.repository.TestItemRepository;

@Controller
public class HelloController {

	/* (1) */
    @Autowired
    TestItemRepository testItemRepository;

    @GetMapping("/")
    public String test(Model model) {
        /* (2) */
        TestItemModel testItemModel = testItemRepository.selectByPrimaryKey(1);
        model.addAttribute("testItem", testItemModel);
        model.addAttribute("greeting", "Hello JINHYEOK!");
        return "hello";
    }
}