package com.springboot.exception;

public class ParkingFullException extends Exception {

	public ParkingFullException(String message) {
		super(message);
	}
}
