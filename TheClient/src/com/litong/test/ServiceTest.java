package com.litong.test;

import com.litong.client.ServiceHello;
import com.litong.client.ServiceHelloService;

public class ServiceTest {

	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();//��ʼ������
		String name = hello.getValue("��ͮ");
		System.out.println(name);

	}

}
