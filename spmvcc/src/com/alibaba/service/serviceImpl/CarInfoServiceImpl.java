package com.alibaba.service.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.dao.CarInfoDao;
import com.alibaba.entity.CarInfoTable;
import com.alibaba.service.CarInfoService;

@Service
public class CarInfoServiceImpl implements CarInfoService{
	@Resource
	private CarInfoDao carInfoDao;
	
	//查询所有车辆信息
	public List<CarInfoTable> queryCarInfo(){
		return carInfoDao.queryCarInfo();
	};
	
	//根据工单号查询车辆信息
	public List<CarInfoTable> queryCarInfoByOrderCode(String orderCode,String carName){
		return carInfoDao.queryCarInfoByOrderCode(orderCode,carName);
	}

	//根据Id查询车辆信息
	public CarInfoTable editCarInfoById(Integer id) {
		return carInfoDao.editCarInfoById(id);
	};
	
}
