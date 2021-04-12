package com.abcproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abcproduct.domain.model.Warehouse;
import com.abcproduct.domain.repository.WarehouseRepository;

@Controller // データ表示確認
//@RestController // API確認
public class WarehouseController {

	@Autowired
	private WarehouseRepository warehouseRepository;

	//全体のデータ情報を照会する
	@GetMapping("/warehouse")
	public List<Warehouse> getWarehouseList(Model model) {
		List<Warehouse> warehouseList = warehouseRepository.getWarehouseList();
		model.addAttribute("warehouseList", warehouseList);
		return warehouseList;
	}

	//	// 全体のデータを照会するAPI
	//	@GetMapping("/warehouse/all")
	//	public List<Warehouse> getWarehouseList() {
	//	    return warehouseRepository.getWarehouseList();
	//}

	//IDでデータ情報を照会する
	@GetMapping("/warehouse/{warehouse_id}")
	public Warehouse getWarehouse(@PathVariable("warehouse_id") int warehouse_id) {
		return warehouseRepository.getWarehouse(warehouse_id);
	}

	//データ生成
	@PostMapping("/warehouse/{warehouse_id}")
	public void insertWarehouse(@PathVariable("warehouse_id") int warehouse_id,
							    @RequestParam("warehouse_name") String warehouse_name,
							    @RequestParam("warehouse_address") String warehouse_address) {

		warehouseRepository.insertWarehouse(warehouse_id, warehouse_name, warehouse_address);
	}

	//データ修正
	@PutMapping("/warehouse/{warehouse_id}")
	public void updateWarehouse(@PathVariable("warehouse_id") int warehouse_id,
							    @RequestParam("warehouse_name") String warehouse_name,
							    @RequestParam("warehouse_address") String warehouse_address) {

		warehouseRepository.updateWarehouse(warehouse_id, warehouse_name, warehouse_address);
	}

	//データ削除
	@DeleteMapping("/warehouse/{warehouse_id}")
	public void deleteWarehouse(@PathVariable("warehouse_id") int warehouse_id) {
		warehouseRepository.deleteWarehouse(warehouse_id);
	}
}