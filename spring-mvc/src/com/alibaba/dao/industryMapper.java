package com.alibaba.dao;

import org.apache.ibatis.annotations.Select;

import com.alibaba.entity.industry;

public interface industryMapper {
//	@Select("select * from industry i where i.id = #{id}") 
	industry selectByPrimaryKey(Integer id);

	int deleteByPrimaryKey(Long id);

    int insert(industry record);

    int insertSelective(industry record);

    int updateByPrimaryKeySelective(industry record);

    int updateByPrimaryKey(industry record);
}