package com.akmalkhamidov.spring.geometryFigures_api.exception_handling;

public class NoSuchFigureException extends RuntimeException{

    public NoSuchFigureException(String message) {
        super(message);
    }
}
