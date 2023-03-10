package com.axis.internalJobservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;





@ControllerAdvice
public class GlobalInternalJobException {
	@ExceptionHandler(value= JobNotFoundException.class)
	public ResponseEntity<String>UserNotFoundExceptionHandler(JobNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
}
