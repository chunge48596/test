package com.alibaba.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.alibaba.dao.CarInfoDao;
import com.alibaba.entity.CarInfoTable;

public interface CarInfoService {
	//查询所有车辆信息
	public List<CarInfoTable> queryCarInfo();
	//根据工单号查询车辆信息
	public List<CarInfoTable> queryCarInfoByOrderCode(String orderCode,String carName);
	public CarInfoTable editCarInfoById(Integer id);
}
