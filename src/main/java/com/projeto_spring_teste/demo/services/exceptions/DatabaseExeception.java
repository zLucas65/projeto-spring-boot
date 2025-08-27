package com.projeto_spring_teste.demo.services.exceptions;

public class DatabaseExeception extends RuntimeException {
  private static final long serialVersionUID = 1L;
  public DatabaseExeception(String message) {
        super(message);
    }
}
