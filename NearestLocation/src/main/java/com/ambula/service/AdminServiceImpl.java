package com.ambula.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ambula.exception.UserException;
import com.ambula.model.UserLocation;
import com.ambula.repository.UserRepo;

public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	private UserRepo userRepo;
	

	@Override
	public UserLocation createData(UserLocation user) {
		
		UserLocation uLocation=userRepo.save(user);
		
		return uLocation;
	}

	@Override
	public String deleteUser(Integer id) throws UserException {
		// TODO Auto-generated method stub
		
		Optional<UserLocation>	opt=userRepo.findById(id);
		
		if(opt.isPresent()) {
			
			 userRepo.delete(opt.get());
			 
			 return "user delected";
		}else {
			
			throw new UserException("No User Found");
		}
			
		
	}

	@Override
	public UserLocation updateUser(Integer id, UserLocation user) throws UserException {
		// TODO Auto-generated method stub
		
	Optional<UserLocation>	opt=userRepo.findById(id);
	
	if(opt.isPresent()) {
		
		return userRepo.save(user);
	}else {
		
		throw new UserException("No User Found");
	}
		
		
	}
	
	
	
}
