package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.abcproduct.domain.model.Product;

@Mapper
public interface ProductRepository {

	//	全体のデータ情報を照会する
	@Select("SELECT * FROM Product")
	List<Product> getProductList();

//	//IDでデータ情報を照会する
//	@Select("SELECT * FROM Product WHERE product_id=#{product_id}")
//	Product getProduct(@Param("product_id") int product_id);
//
//	//データ生成
//	@Insert("INSERT INTO Product VALUES(#{product_name}, #{product_price})")
//	int insertProduct(@Param("product_name") String product_name, @Param("product_price") int product_price);
//
//	//データ修正
//	@Update("UPDATE Product SET product_name=#{product_name}, product_price=#{product_price} "
//		  + "WHERE product_id=#{product_id}")
//	int updateProduct(@Param("product_id") int product_id,
//					  @Param("product_name") String product_name,
//					  @Param("product_price") int product_price);
//
//	//データ削除
//	@Delete("DELETE from Product where product_id = #{product_id}")
//	int deleteProduct(@Param("product_id") int product_id);
}