package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.abcproduct.domain.model.Warehouse;

@Mapper
public interface WarehouseRepository {

	//全体のデータ情報を照会する
	@Select("SELECT * FROM Warehouse")
	List<Warehouse> getWarehouseList();

	//IDでデータ情報を照会する
	@Select("SELECT * FROM Warehouse WHERE warehouse_id=#{warehouse_id}")
	Warehouse getWarehouse(@Param("warehouse_id") int warehouse_id);

	// 生成
	@Insert("INSERT INTO Warehouse VALUES(#{warehouse_id},#{warehouse_name},#{warehouse_address})")
	int insertWarehouse(@Param("warehouse_id") int warehouse_id,
					    @Param("warehouse_name") String warehouse_name,
					    @Param("warehouse_address") String warehouse_address);

	// 修正
	@Update("UPDATE warehouse SET warehouse_name=#{warehouse_name}, warehouse_address=#{warehouse_address} "
		  + "WHERE warehouse_id=#{warehouse_id}")
	int updateWarehouse(@Param("warehouse_id") int warehouse_id,
						@Param("warehouse_name") String warehouse_name,
					    @Param("warehouse_address") String warehouse_address);

	// 削除
	@Delete("DELETE from warehouse where warehouse_id = #{warehouse_id}")
	int deleteWarehouse(@Param("warehouse_id") int warehouse_id);
}