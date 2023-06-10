package com.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class HandlerException {

   @ExceptionHandler(ClienteNaoEncontradoException.class)
   public ResponseStatusException notFoundHandler(ClienteNaoEncontradoException exception){
   return  new ResponseStatusException(
           HttpStatus.NOT_FOUND, exception.getMsg(), exception);
   }
}
