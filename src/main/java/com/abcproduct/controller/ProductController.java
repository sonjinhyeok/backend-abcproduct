package com.abcproduct.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Product;

@RestController
public class ProductController {

	private Map<Object, Product> productMap;

	@PostConstruct
	public void init() {
		productMap = new HashMap<Object, Product>();
		productMap.put(1, new Product(1,"AAA自動車",1000));
		productMap.put(2, new Product(2,"BBB自動車",2000));
		productMap.put(3, new Product(3,"CCC自動車",3000));
	}

	//IDでデータ情報を照会する
	@GetMapping("/product/{id}")
	public Product getProductModel(@PathVariable("id") int product_id) {
		return productMap.get(product_id);
	}

	//全体のデータ情報を照会する
	@GetMapping("/product/all")
	public List<Product> getProductModelList() {
		return new ArrayList<Product>(productMap.values());
	}

	//データ生成
	@PostMapping("/product/{id}")
	public void postProductModel( @PathVariable("id") int product_id,
								 @RequestParam("product_name") String product_name,
								 @RequestParam("product_price") int product_price) {
		Product productModel = new Product(product_id, product_name , product_price);
		productMap.put(product_id, productModel);
	}

	//データ修正
	@PutMapping("/product/{id}")
	public void putProductModel( @PathVariable("id") int product_id,
								 @RequestParam("product_name") String product_name,
								 @RequestParam("product_price") int product_price) {
		Product productModel = productMap.get(product_id);
		productModel.setProduct_name(product_name);
		productModel.setProduct_price(product_price);
	}

	//データ削除
	@DeleteMapping("/product/{id}")
	public void deleteProductModel(@PathVariable("id") int product_id) {
		productMap.remove(product_id);
	}
}
