package com.zolee;

import javax.xml.ws.Endpoint;

public class ArithmeticServiceMain {

	public static void main(String[] args) {
		Endpoint endPoint = Endpoint.create(new ArithmeticServiceImpl());
		endPoint.publish("http://127.0.0.1:8080/arithmeticservice");
	}
}
