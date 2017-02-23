package com.litong.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.litong.service.entity.User;

@WebService
public interface HelloWord {
	 String sayHi(@WebParam(name="text")String text);
     String sayHiToUser(User user);
     String[] SayHiToUserList(List<User> userList);
}
