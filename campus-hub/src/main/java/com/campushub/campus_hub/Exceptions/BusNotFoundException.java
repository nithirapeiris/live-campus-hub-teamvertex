package com.campushub.campus_hub.Exceptions;

public class BusNotFoundException extends RuntimeException {
    public BusNotFoundException(){
        super();
    }
    public BusNotFoundException(String message){
        super(message);
    }
    public BusNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
