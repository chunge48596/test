package com.alibaba.service;

import com.alibaba.entity.industry;

public interface industryService {
	//根据ID查询行业信息
	public industry selectByPrimaryKey(Integer id);
	
}
