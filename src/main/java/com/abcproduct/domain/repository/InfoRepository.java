package com.abcproduct.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.abcproduct.domain.model.Info;
import com.abcproduct.domain.model.InfoExample;

@Repository
@Mapper
public interface InfoRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    long countByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int deleteByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int insert(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int insertSelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    List<Info> selectByExample(InfoExample example);

    List<Info> selectByExample();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    Info selectByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int updateByPrimaryKeySelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info
     *
     * @mbg.generated Fri Apr 16 17:57:02 JST 2021
     */
    int updateByPrimaryKey(Info record);
}