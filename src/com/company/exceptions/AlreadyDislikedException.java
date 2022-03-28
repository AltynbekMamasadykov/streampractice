package com.company.exceptions;

public class AlreadyDislikedException extends RuntimeException{

    public AlreadyDislikedException() {
        super();
    }

    public AlreadyDislikedException(String message){
        super(message);
    }


}
