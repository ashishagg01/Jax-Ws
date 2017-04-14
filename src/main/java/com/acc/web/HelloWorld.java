package com.acc.web;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@HandlerChain(file = "handler-chain.xml")
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld {
	public String helloWorld(String name);
}
