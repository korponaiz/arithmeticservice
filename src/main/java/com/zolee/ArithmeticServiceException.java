package com.zolee;

import javax.xml.ws.WebFault;

@WebFault(name = "ArithmeticServiceExceptionBean", targetNamespace = "http://zolee.com/")
public class ArithmeticServiceException extends Exception{

	private ArithmeticServiceExceptionBean arithmeticServiceExceptionBean;

	public ArithmeticServiceException(String errorMessage, ArithmeticServiceExceptionBean arithmeticServiceExceptionBean) {
		super(errorMessage);
		this.arithmeticServiceExceptionBean = arithmeticServiceExceptionBean;
	}
	
	public ArithmeticServiceException(String errorMessage, ArithmeticServiceExceptionBean arithmeticServiceExceptionBean, Throwable cause) {
		super(errorMessage, cause);
		this.arithmeticServiceExceptionBean = arithmeticServiceExceptionBean;
	}

	public ArithmeticServiceExceptionBean getArithmeticServiceExceptionBean() {
		return arithmeticServiceExceptionBean;
	}
	
}
