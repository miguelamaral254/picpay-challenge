package br.com.curso.core.exception;

public class BadRequestException extends Exception{
    private String code;
    private String message;

    public BadRequestException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
