package com.my.hawtioboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.hawt.config.ConfigFacade;
import io.hawt.springboot.HawtPlugin;


/* 
 *  http://localhost:10000/sample-app 
 *  http://localhost:10001/hawtio/index.html 
 */

@SpringBootApplication
public class SampleSpringBootService {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootService.class, args);
	}
	
	@Bean
	public HawtPlugin samplePlugin() {
		return new HawtPlugin("sample-plugin", 
				"plugins",
				"",
				new String[] {"sample-plugin/js/sample-plugin-js"});
	}

	@Bean
	public ConfigFacade configFacade() {
		return ConfigFacade.getSingleton();
	}
	
}
