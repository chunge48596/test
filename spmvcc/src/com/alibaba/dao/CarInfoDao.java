package com.alibaba.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alibaba.entity.CarInfoTable;

public interface CarInfoDao {
	//查询所有车辆信息  测试git我修改一下然后提交看看什么效果
	List<CarInfoTable> queryCarInfo();
	//根据工单号查询车辆信息
	List<CarInfoTable> queryCarInfoByOrderCode(@Param("orderCode")String orderCode,@Param("carName")String carName);
	//根据ID查询车辆信息
	CarInfoTable editCarInfoById(@Param("id")Integer id);
}
