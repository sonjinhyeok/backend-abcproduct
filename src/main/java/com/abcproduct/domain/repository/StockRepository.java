package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.abcproduct.domain.model.Stock;
import com.abcproduct.domain.model.StockExample;

@Mapper
public interface StockRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    long countByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int deleteByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int insert(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int insertSelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    List<Stock> selectByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    Stock selectByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Apr 13 15:02:42 JST 2021
     */
    int updateByPrimaryKey(Stock record);
}