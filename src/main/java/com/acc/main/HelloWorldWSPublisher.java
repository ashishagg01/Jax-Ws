package com.acc.main;

import javax.xml.ws.Endpoint;

import com.acc.web.HelloWorldImpl;

public class HelloWorldWSPublisher {
	public static void main(String[] args) {  
		   Endpoint.publish("http://localhost:8080/WS/HelloWorld",new HelloWorldImpl());  
		  } 

}
