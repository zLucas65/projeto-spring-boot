package com.projeto_spring_teste.demo.services.exeptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
