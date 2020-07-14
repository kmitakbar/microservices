package com.training.spring.soap.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.training.spring.soap.consumer.client.UserRequest;
import com.training.spring.soap.consumer.client.UserResponse;

@Service
public class UserService {

	@Autowired
	Jaxb2Marshaller marshaller;
	
	WebServiceTemplate template;
	
	
	public UserResponse getUser(UserRequest request) {
		template=new WebServiceTemplate(marshaller);
		
		UserResponse response=(UserResponse) template.marshalSendAndReceive("http://localhost:9090/soapws/", request);
		System.out.println("inside service"+response);
		return response;
	}
}
