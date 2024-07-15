package com.srivath.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleException(Exception ex) {
		String msg = ex.getMessage();
		return new ResponseEntity<String>("We are currently facing this error" + msg + ", so please try again later",
				HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
