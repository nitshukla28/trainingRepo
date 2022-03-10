package com.activemq.ActiveMQSpringBoot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProduceData extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:my-first-timer?period=50000")
		.transform().constant("My constant message")
//		.log("${body}")
		.to("activemq:my-active-DummyQ");
	}

}
