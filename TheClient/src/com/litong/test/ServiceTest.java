package com.litong.test;

import com.litong.client.ServiceHello;
import com.litong.client.ServiceHelloService;

public class ServiceTest {

	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();//初始化对象
		String name = hello.getValue("李彤");
		System.out.println(name);

	}

}
