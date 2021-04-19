package com.example.rest.service;

import java.util.List;

import com.example.rest.entity.User;

public interface UserService {

	String register(User newUser);    //create
	void modify(User newUser);		//update
	void remove(String id);				//delete
	
	User find(String id);				//retrieve
	List<User> findAll();				//retrieveAll 
}
