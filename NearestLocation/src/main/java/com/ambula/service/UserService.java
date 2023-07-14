package com.ambula.service;

import java.util.List;

import com.ambula.model.UserLocation;

public interface UserService {

	public List<UserLocation> getNearUser(Integer n);
}
