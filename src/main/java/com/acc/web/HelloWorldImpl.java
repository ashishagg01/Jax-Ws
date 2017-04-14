package com.acc.web;

import javax.jws.WebService;

@WebService(endpointInterface="com.acc.web.HelloWorld")  
public class HelloWorldImpl implements HelloWorld {

	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello world from "+name;
	}

}
