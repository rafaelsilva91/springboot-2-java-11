package com.systemmvp.sysorders.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -2490690497768200227L;

    public ResourceNotFoundException(Object id){
        super("Resouce not found. Id " + id);
    }
}
