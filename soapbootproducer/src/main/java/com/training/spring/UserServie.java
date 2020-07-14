package com.training.spring;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.services.techit.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserServie {

	static Map<String, User> users=new HashMap<String, User>();
	@PostConstruct
	public void usersList() {
		
		User akbar=new User();
		akbar.setUid(100);
		akbar.setGender("male");
		akbar.setName("akbar");
		
		User sanaa=new User();
		sanaa.setUid(101);
		sanaa.setGender("female");
		sanaa.setName("sanaa");
		
		User rehaan=new User();
		rehaan.setUid(102);
		rehaan.setGender("male");
		rehaan.setName("rehaan");
		
		users.put("akbar", akbar);
		users.put("sanaa", sanaa);
		users.put("rehaan", rehaan);
		
	}
	
	public User getuserByName(String name) {
		
		return users.get(name);
		
	}
}
