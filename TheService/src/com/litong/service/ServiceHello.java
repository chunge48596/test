package com.litong.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8089/Service/ServiceHello", new ServiceHello());
		System.out.println("service success!");
	}

	/**
	 * 供客户端调用的方法
	 * @param name 传入参数
	 * @return String 返回结果
	 * 	
	 **/
	public String getValue(String name){
		return "我叫："+name;
	}
	
}
