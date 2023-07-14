package com.ambula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ambula.model.UserLocation;
import com.ambula.repository.UserRepo;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public List<UserLocation> getNearUser(Integer n) {
		// TODO Auto-generated method stub
		
		List<UserLocation> usersList=userRepo.findAll();
		
		return null;
	}

}
