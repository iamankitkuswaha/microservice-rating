package com.ankit.rating.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomException> handleResourceNotFoundException(ResourceNotFoundException e){
        CustomException customException = new CustomException(e.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(customException, HttpStatus.NOT_FOUND);
    }
}
