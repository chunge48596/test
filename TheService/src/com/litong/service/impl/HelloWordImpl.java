package com.litong.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.litong.service.HelloWord;
import com.litong.service.entity.User;

@WebService(endpointInterface="com.litong.service.HelloWord",serviceName="HelloWord")
public class HelloWordImpl implements HelloWord{

	public static void main(String[] args) {
	  System.out.println("web service start");
      String address="http://localhost:8089/helloWorld";
      Endpoint.publish(address, new HelloWordImpl());
      System.out.println("web service started");
	}

	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	public String sayHi(String text) {
		return "Hello " + text;
	}

	public String sayHiToUser(User user) {
		users.put(users.size() + 1, user);
		return "Hello " + user.getName() + "ƒ„µƒƒÍ¡‰ « " + user.getAge();
	}

	public String[] SayHiToUserList(List<User> userList) {
		String[] result = new String[userList.size()];
		int i = 0;
		for (User u : userList) {
			result[i] = "Hello " + u.getName();
			i++;
		}
		return result;
	}

}
