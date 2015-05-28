package edu.avans.library.domain;

public class Invalid_SSN_Exception extends Exception {
	private static final long serialVersionUID = 1l;
	
	public Invalid_SSN_Exception(String message) {
		super(message);
	}
}
