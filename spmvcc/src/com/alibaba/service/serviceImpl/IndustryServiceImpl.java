package com.alibaba.service.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.dao.IndustryDao;
import com.alibaba.entity.IndustryTable;
import com.alibaba.service.IndustryService;

@Service
public class IndustryServiceImpl implements IndustryService{
	@Resource
	private IndustryDao industryDao;
	
	//查询所有行业信息
	public List<IndustryTable> queryIndustry(){
		return industryDao.queryIndustry();
	}

	@Override
	public List<IndustryTable> queryIndustryByOrderCode(String orderCode,
			String carName) {
		// TODO Auto-generated method stub
		return null;
	};
	
	//保存行业信息
	public int saveIndustry(IndustryTable industry){
		return industryDao.insertSelective(industry);
	}
	
	//删除行业信息
	public int delIndustry(int id){
		return industryDao.deleteByPrimaryKey(id);
	}
	/*//根据Id查询车辆信息
	public CarInfoTable editCarInfoById(Integer id) {
		return carInfoDao.editCarInfoById(id);
	};*/
	
}
