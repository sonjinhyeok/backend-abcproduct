package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abcproduct.domain.model.Product;
import com.abcproduct.domain.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	//全体のデータ情報を照会する
	@GetMapping("/product")
	public List<Product> getProductList(Model model) {
		List<Product> productList = productRepository.getProductList();
		model.addAttribute("productList", productList);
	    return productList;
	}

//	//全体のデータ情報を照会する
//	@GetMapping("/product")
//	public List<Product> getProductList() {
//		return productRepository.getProductList();
//	}

//	//IDでデータ情報を照会する
//	@GetMapping("/product/{product_id}")
//	public Product getProduct(@PathVariable("product_id") int product_id) {
//		return productRepository.getProduct(product_id);
//	}
//
//	//データ生成
//	@PostMapping("/product/{product_id}")
//	public void insertProduct(@RequestParam("product_name") String product_name,
//							  @RequestParam("product_price") int product_price) {
//
//		productRepository.insertProduct(product_name, product_price);
//	}
//
//	//データ修正
//	@PutMapping("/product/{product_id}")
//	public void updateProduct( @PathVariable("product_id") int product_id,
//							   @RequestParam("product_name") String product_name,
//							   @RequestParam("product_price") int product_price) {
//
//		productRepository.updateProduct(product_id, product_name, product_price);
//	}
//
//	//データ削除
//	@DeleteMapping("/product/{product_id}")
//	public void deleteProduct(@PathVariable("product_id") int product_id) {
//		productRepository.deleteProduct(product_id);
//	}
}