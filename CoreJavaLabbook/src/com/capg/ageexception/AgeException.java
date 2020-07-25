package com.capg.ageexception;

public class AgeException extends RuntimeException {

	public AgeException(String message) {

		System.err.println(message);
	}
}
