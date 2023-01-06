package com.akmalkhamidov.spring.geometryFigures_api.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FigureGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<FigureIncorrectData> handlerException(NoSuchFigureException exception){

        FigureIncorrectData data = new FigureIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<FigureIncorrectData> handlerException(Exception exception){

        FigureIncorrectData data = new FigureIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

}
