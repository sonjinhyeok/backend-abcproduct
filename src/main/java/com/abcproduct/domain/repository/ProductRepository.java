package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.abcproduct.domain.model.Product;

@Mapper
public interface ProductRepository {

	// idが一致するデータを照会
	@Select("SELECT * FROM product WHERE product_id=#{product_id}")
	Product getProduct(@Param("product_id") int product_id);

	// 全体のデータを照会
	@Select("SELECT * FROM product")
	List<Product> getProductList();

	// 生成
	@Insert("INSERT INTO product VALUES(#{product_id},#{product_name},#{product_price})")
	int insertProduct(@Param("product_id") int product_id,
					  @Param("product_name") String product_name,
					  @Param("product_price") int product_price);

	// 更新
	@Update("UPDATE product SET product_name=#{product_name},product_price=#{product_price} WHERE product_id=#{product_id}")
	int updateProduct(@Param("product_id") int product_id,
			  		  @Param("product_name") String product_name,
			  		  @Param("product_price") int product_price);

	// 削除
	@Delete("DELETE product WHERE product_id=#{product_id}")
	int deleteProduct(@Param("product_id") int product_id);

}
