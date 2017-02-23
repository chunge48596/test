package com.alibaba.service;

import java.util.List;

import com.alibaba.entity.CarInfoTable;
import com.alibaba.entity.IndustryTable;

public interface IndustryService {
	//查询所有行业信息
	public List<IndustryTable> queryIndustry();
	//根据工单号查询行业信息    未实现
	public List<IndustryTable> queryIndustryByOrderCode(String orderCode,String carName);
	//保存行业信息
	public int saveIndustry(IndustryTable industry);
	//删除行业信息
	public int delIndustry(int id);
}
