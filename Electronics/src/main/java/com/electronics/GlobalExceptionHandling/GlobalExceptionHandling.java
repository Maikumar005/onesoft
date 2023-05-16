package com.electronics.GlobalExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electronics.customException.IdNotFoundException;
import com.electronics.customException.LowPriceExcep;

@RestControllerAdvice
public class GlobalExceptionHandling {
@ExceptionHandler(LowPriceExcep.class)
public ResponseEntity<Object> lowPricehandle(){
	return new ResponseEntity <Object>("you are entering wrong input",HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(IdNotFoundException.class)
public ResponseEntity<Object> IdNotFoundhandle(){
	return new ResponseEntity <Object>("id not found",HttpStatus.BAD_REQUEST);
}
}
