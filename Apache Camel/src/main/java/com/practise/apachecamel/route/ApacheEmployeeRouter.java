package com.practise.apachecamel.route;

import org.apache.camel.builder.RouteBuilder;

public class ApacheEmployeeRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("javadsl/weather/lodon").log("Sudarsan Kumar");
	}

}
