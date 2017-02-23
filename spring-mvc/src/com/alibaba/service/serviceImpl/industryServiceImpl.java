package com.alibaba.service.serviceImpl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.alibaba.dao.industryMapper;
import com.alibaba.entity.industry;
import com.alibaba.service.industryService;

@Service
public class industryServiceImpl implements industryService{
	@Resource
	private industryMapper industryDao;
	
	//根据id查询行业信息
	public industry selectByPrimaryKey(Integer id){
		return industryDao.selectByPrimaryKey(id);
	}
}
