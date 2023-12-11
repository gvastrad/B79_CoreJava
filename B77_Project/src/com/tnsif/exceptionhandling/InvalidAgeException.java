package com.tnsif.exceptionhandling;

public class InvalidAgeException extends Exception {

	private String message;
	public InvalidAgeException() {
		super("Invalid Age");
	}
    public InvalidAgeException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
      
}
