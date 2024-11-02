package com.java.in.exception;

public class CourseServiceBusinessException extends RuntimeException{

    public CourseServiceBusinessException(String message) {
        super(message);
    }
}
