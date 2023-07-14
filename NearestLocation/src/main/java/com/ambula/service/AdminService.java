package com.ambula.service;

import com.ambula.exception.UserException;
import com.ambula.model.UserLocation;

public interface AdminService {

	public UserLocation createData(UserLocation user);
	
	public String deleteUser(Integer id) throws UserException;
	
	public UserLocation updateUser(Integer id,UserLocation user) throws UserException;
}
