package com.litong.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class HelloWorldClient {

	public static void main(String[] args) {
		  JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
          svr.setServiceClass(HelloWord.class);
          svr.setAddress("http://localhost:8089/helloWorld");
          HelloWord hw = (HelloWord) svr.create();
          User user = new User();
          user.setName("¿ÓÕ®");
          user.setAge("2");
          System.out.println(hw.sayHiToUser(user));

	}

}
