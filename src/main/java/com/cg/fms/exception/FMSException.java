package com.cg.fms.exception;

public class FMSException extends Exception{
	private static final long serialVersionUID = 1L;

	public FMSException(String errorMessage) {
		super(errorMessage);
	}

}
