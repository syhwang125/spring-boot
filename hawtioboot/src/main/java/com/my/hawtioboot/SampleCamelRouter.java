package com.my.hawtioboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleCamelRouter extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		from("timer:hello?period={{timer.period}}")
			.setBody().constant("Hello Camel! What are you doing now? ")
			.to("stream:out")
			.to("mock:result");
	}
}
