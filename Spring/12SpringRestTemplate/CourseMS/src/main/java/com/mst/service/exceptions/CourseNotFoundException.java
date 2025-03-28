package com.mst.service.exceptions;

public class CourseNotFoundException extends Exception {
	private String messgae;
	public CourseNotFoundException(String message) {
		super(message);
	}
}
