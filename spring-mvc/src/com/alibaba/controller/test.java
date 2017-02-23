package com.alibaba.controller;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.entity.industry;
import com.alibaba.service.industryService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class test {
	private static Logger logger = Logger.getLogger(test.class); 
	@Resource
	private industryService iService;
	@Test
	public void test2(){
		industry i = iService.selectByPrimaryKey(3);
		System.out.println("行业说明："+i.getCategoryExplain());
		logger.info("行业说明："+i.getCategoryExplain());
	}
}
