package com.ambula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambula.exception.UserException;
import com.ambula.model.UserLocation;
import com.ambula.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/Admin")
	public ResponseEntity<UserLocation> createData(@Valid @RequestBody UserLocation user) {
		
		UserLocation saveUserLocation= adminService.createData(user);
		
		return new ResponseEntity<UserLocation>(saveUserLocation,HttpStatus.CREATED);
	
	}
		
	
	@DeleteMapping("/Admin/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable ("id") Integer id) throws UserException{
		
		String reply=adminService.deleteUser(id);
		
		return new ResponseEntity<String>(reply,HttpStatus.OK);
		
	}
	
	public ResponseEntity<UserLocation> updateUser(@RequestBody UserLocation user) throws UserException{
		
		UserLocation updatedLocation=adminService.updateUser(user.getId(), user);
	
		return new ResponseEntity<UserLocation>(updatedLocation,HttpStatus.CREATED);
		
	}
	
	
	
	
	
	

}
