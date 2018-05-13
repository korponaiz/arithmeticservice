package com.zolee;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ArithmeticService {

	@WebMethod
	float add(String numberA, String numberB) throws ArithmeticServiceException;

	@WebMethod
	float subtract(String numberA, String numberB) throws ArithmeticServiceException;

	@WebMethod
	float multiply(String numberA, String numberB) throws ArithmeticServiceException;

	@WebMethod
	float divide(String numberA, String numberB) throws ArithmeticServiceException;

}
