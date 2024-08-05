package br.com.curso.core.exception;

public class NotFoundException extends Exception{
    private String code;
    private String message;

    public NotFoundException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
