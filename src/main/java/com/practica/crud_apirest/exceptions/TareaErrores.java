package com.practica.crud_apirest.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class TareaErrores {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handlerEntityNotFoundException(EntityNotFoundException ERROR){
        return new ResponseEntity<>("Error: la tarea no existe", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handlerDataIntegrityViolationException(DataIntegrityViolationException ERROR){
        return new ResponseEntity<>("Error: El tipo de dato no es válido para el campo",HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handlerTypeMismatch(MethodArgumentTypeMismatchException ERROR){
        return new ResponseEntity<>("El parametro"+ERROR.getName()+"debe ser de tipo "+ERROR.getRequiredType(),HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<String> handlerRequestMethodNotSupported(HttpRequestMethodNotSupportedException ERROR){
        return new ResponseEntity<>("El método"+ERROR.getMethod()+"no está soportado para esta ruta",HttpStatus.METHOD_NOT_ALLOWED);
    }

   
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<String> handlerMediaTypeNotSupported(HttpMediaTypeNotSupportedException ERROR){
        return new ResponseEntity<>("El formato del contenido "+ERROR.getContentType()+"no es válido",HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ERROR) {
        return new ResponseEntity<>("Ha ocurrido un error inesperado en el servidor: " + ERROR.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ERROR) {
        return new ResponseEntity<>("Error en los datos enviados: " + ERROR.getMessage(), HttpStatus.BAD_REQUEST);
    }
    

}
