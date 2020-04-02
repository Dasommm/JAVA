package com.test02;

public class MyException extends Exception {

	public MyException() {
		this("Exception Test!");

	}

	public MyException(String message) {
		super(message);

	}
}
