package com.zolee;

import javax.jws.WebService;

import org.apache.commons.lang3.math.NumberUtils;

@WebService(endpointInterface = "com.zolee.ArithmeticService")
public class ArithmeticServiceImpl implements ArithmeticService {

	public float add(String numberA, String numberB) throws ArithmeticServiceException{
		if(!NumberUtils.isNumber(numberA) || !NumberUtils.isNumber(numberB)){
			throw new ArithmeticServiceException("Wrong number format!", new ArithmeticServiceExceptionBean());
		}else{
			return Float.parseFloat(numberA) + Float.parseFloat(numberB);
		}
	}

	public float subtract(String numberA, String numberB) throws ArithmeticServiceException{
		if(!NumberUtils.isNumber(numberA) || !NumberUtils.isNumber(numberB)){
			throw new ArithmeticServiceException("Wrong number format!", new ArithmeticServiceExceptionBean());
		}else{
			return Float.parseFloat(numberA) - Float.parseFloat(numberB);
		}
	}

	public float multiply(String numberA, String numberB) throws ArithmeticServiceException{
		if(!NumberUtils.isNumber(numberA) || !NumberUtils.isNumber(numberB)){
			throw new ArithmeticServiceException("Wrong number format!", new ArithmeticServiceExceptionBean());
		}else{
			return Float.parseFloat(numberA) * Float.parseFloat(numberB);
		}
	}


	public float divide(String numberA, String numberB) throws ArithmeticServiceException{
		if(!NumberUtils.isNumber(numberA) || !NumberUtils.isNumber(numberB)){
			throw new ArithmeticServiceException("Wrong number format!", new ArithmeticServiceExceptionBean());
		}else if(Float.parseFloat(numberB) == 0){
			throw new ArithmeticServiceException("Divide by Zero!", new ArithmeticServiceExceptionBean());
		}else{
			return Float.parseFloat(numberA) / Float.parseFloat(numberB);
		}
	}

}
