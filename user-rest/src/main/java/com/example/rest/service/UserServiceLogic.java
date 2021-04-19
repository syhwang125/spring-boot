package com.example.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.entity.User;
import com.example.rest.store.UserStore;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor			//DI -1 
public class UserServiceLogic implements UserService {

//	@Autowired   //DI-2
	private final UserStore userStore;
	
//	public UserServiceLogic(UserStore userStore) {     //DI-3
//		this.userStore = userStore;
//	}
	
	@Override
	public String register(User newUser) {
		return this.userStore.create(newUser);
	}

	@Override
	public void modify(User newUser) {
		this.userStore.update(newUser);
	}

	@Override
	public void remove(String id) {
		this.userStore.delete(id);
	}

	@Override
	public User find(String id) {
		return this.userStore.retrieve(id);
	}

	@Override
	public List<User> findAll() {
		return this.userStore.retrieveAll();
	}

}
