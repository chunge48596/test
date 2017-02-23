package com.alibaba.dao;

import java.util.List;

import com.alibaba.entity.IndustryTable;

public interface IndustryDao {
	List<IndustryTable> queryIndustry();
	
    int deleteByPrimaryKey(int id);

    int insert(IndustryTable record);

    int insertSelective(IndustryTable record);

    IndustryTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustryTable record);

    int updateByPrimaryKey(IndustryTable record);
}