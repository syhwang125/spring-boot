package com.my.springboot1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainController {

	@CrossOrigin
	@GetMapping("/bs")
	public Domain domain() {
		Domain domain = new Domain();
		domain.setSteamerName("Seoyeon");
		domain.setTitle("Spring Boot Reference study");
		return domain;
	}
	
}
