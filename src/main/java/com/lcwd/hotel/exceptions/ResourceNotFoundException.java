package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private String message;
    public ResourceNotFoundException(){
        super("Resource not found on server");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
