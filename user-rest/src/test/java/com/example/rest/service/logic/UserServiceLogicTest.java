package com.example.rest.service.logic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.rest.entity.User;
import com.example.rest.service.UserService;

@SpringBootTest
public class UserServiceLogicTest {

	@Autowired
	private UserService userService;
	
	
	private User kim;
	private User lee;
	
	@BeforeEach
	public void startUp() {
		this.kim = new User("kim", "kim@poscoict.com");
		this.lee = new User("lee", "lee@poscoict.com");
		
		this.userService.register(lee);
		this.userService.register(kim);
	}
	
	
	@Test
	public void registerTest() {
		
		User sample = User.sample();
		this.userService.register(sample);
		
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.findAll().size()).isEqualTo(2);
		
		this.userService.remove(sample.getId());
		
	}
	

	@Test
	public void find() {
		assertThat(this.userService.find(lee.getId())).isNotNull();
		assertThat(this.userService.find(lee.getId())).isEqualTo(lee.getEmail());
	}
	
	@AfterEach
	public void cleanUp() {
		this.userService.remove(kim.getId());
		this.userService.remove(lee.getId());
	}
	
	
}
