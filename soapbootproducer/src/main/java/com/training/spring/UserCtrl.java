package com.training.spring;

import org.services.techit.user.UserRequest;
import org.services.techit.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserCtrl {


	@Autowired
	UserServie userServie;
	
	@PayloadRoot(namespace = "http://www.techit.services.org/user",localPart = "userRequest")
	@ResponsePayload
	public UserResponse getUSerByNaame(@RequestPayload UserRequest request) {
		UserResponse response=new UserResponse();
		response.setUser(userServie.getuserByName(request.getName()));
		return response;
	}
}
