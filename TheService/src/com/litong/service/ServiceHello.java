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
	 * ���ͻ��˵��õķ���
	 * @param name �������
	 * @return String ���ؽ��
	 * 	
	 **/
	public String getValue(String name){
		return "�ҽУ�"+name;
	}
	
}
