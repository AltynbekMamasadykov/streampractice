package com.company.exceptions;

public class AlreadyLikedException extends RuntimeException{

    public AlreadyLikedException() {
        super();
    }

    public AlreadyLikedException(String message){
        super(message);
    }
}
