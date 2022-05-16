package com.systemmvp.sysorders.services.exceptions;

public class DatabaseException extends RuntimeException{
    private static final long serialVersionUID = 2430314642114545967L;

    public DatabaseException(String msg){
        super(msg);
    }
}
