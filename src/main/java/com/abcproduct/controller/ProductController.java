package com.abcproduct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Product;
import com.abcproduct.domain.repository.ProductRepository;

@RestController
public class ProductController {

	private ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	//全体のデータ情報を照会する
	@GetMapping("/product")
	public List<Product> getProductList() {
		return productRepository.getProductList();
	}

	//IDでデータ情報を照会する
	@GetMapping("/product/{product_id}")
	public Product getProduct(@PathVariable("product_id") int product_id) {
		return productRepository.getProduct(product_id);
	}

	//データ生成
	@PostMapping("/product/{product_id}")
	public void insertProduct( @PathVariable("product_id") int product_id,
							   @RequestParam("product_name") String product_name,
							   @RequestParam("product_price") int product_price) {

		productRepository.insertProduct(product_id, product_name, product_price);
	}

	//データ修正
	@PutMapping("/product/{product_id}")
	public void updateProduct( @PathVariable("product_id") int product_id,
							   @RequestParam("product_name") String product_name,
							   @RequestParam("product_price") int product_price) {

		productRepository.updateProduct(product_id, product_name, product_price);
	}

	//データ削除
	@DeleteMapping("/product/{product_id}")
	public void deleteProduct(@PathVariable("product_id") int product_id) {
		productRepository.deleteProduct(product_id);
	}
}