package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.abcproduct.domain.model.Stock;

@Mapper
public interface StockRepository {

	//IDでデータ情報を照会する
	@Select("SELECT * FROM Stock WHERE product_id=#{product_id}")
	Stock getStock(@Param("product_id") int product_id);

	//全体のデータ情報を照会する
	@Select("SELECT * FROM Stock")
	List<Stock> getStockList();

	//データ生成
	@Insert("INSERT INTO Stock VALUES(#{product_id}, #{warehouse_id}, #{stock_count}, #{stock_in}, #{stock_out})")
	int insertStock(@Param("product_id") int product_id,
					@Param("warehouse_id") String warehouse_id,
					@Param("stock_count") int stock_count,
					@Param("stock_in") Boolean stock_in,
					@Param("stock_out") Boolean stock_out);

	//データ修正
	@Update("UPDATE Stock SET stock_count=#{stock_count},"
						  + " stock_in=#{stock_in},"
						  + " stock_out=#{stock_out}"
						  + "WHERE product_id=#{product_id}")

	int updateStock(@Param("product_id") int product_id,
					  @Param("warehouse_id") String warehouse_id,
					  @Param("stock_count") int stock_count,
					  @Param("stock_in") Boolean stock_in,
					  @Param("stock_out") Boolean stock_out);

	//データ削除
	@Delete("DELETE from Stock where product_id = #{product_id}")
	int deleteStock(@Param("product_id") int product_id);
}
