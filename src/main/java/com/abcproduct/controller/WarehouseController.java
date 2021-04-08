package com.abcproduct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcproduct.domain.model.Warehouse;
import com.abcproduct.domain.repository.WarehouseRepository;

@RestController
public class WarehouseController {

	private WarehouseRepository warehouseRepository;

	public WarehouseController(WarehouseRepository warehouseRepository) {
		this.warehouseRepository = warehouseRepository;
	}

	//全体のデータ情報を照会する
	@GetMapping("/warehouse")
	public List<Warehouse> getWarehouseList() {
		return warehouseRepository.getWarehouseList();
	}

	//IDでデータ情報を照会する
	@GetMapping("/warehouse/{warehouse_id}")
	public Warehouse getWarehouse(@PathVariable("warehouse_id") String warehouse_id) {
		return warehouseRepository.getWarehouse(warehouse_id);
	}

	//データ生成
	@PostMapping("/warehouse/{warehouse_id}")
	public void insertWarehouse(@PathVariable("warehouse_id") String warehouse_id,
							   @RequestParam("warehouse_name") String warehouse_name,
							   @RequestParam("warehouse_address") String warehouse_address) {

		warehouseRepository.insertWarehouse(warehouse_id, warehouse_name, warehouse_address);
	}

	//データ修正
	@PutMapping("/warehouse/{warehouse_id}")
	public void updateWarehouse(@PathVariable("warehouse_id") String warehouse_id,
							   @RequestParam("warehouse_name") String warehouse_name,
							   @RequestParam("warehouse_address") String warehouse_address) {

		warehouseRepository.updateWarehouse(warehouse_id, warehouse_name, warehouse_address);
	}

	//データ削除
	@DeleteMapping("/warehouse/{warehouse_id}")
	public void deleteWarehouse(@PathVariable("warehouse_id") String warehouse_id) {
		warehouseRepository.deleteWarehouse(warehouse_id);
	}

}
