package com.alibaba.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.entity.CarInfoTable;
import com.alibaba.service.CarInfoService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class); 
	@Resource
	private CarInfoService carInfoService;
	
	@Test
	public void test2(){
		List<CarInfoTable> listcar = carInfoService.queryCarInfo();
		for(CarInfoTable c : listcar){
			System.out.println("车牌号："+c.getCarNumber());
			logger.info("车牌号："+c.getCarNumber());
		}
	}
}
