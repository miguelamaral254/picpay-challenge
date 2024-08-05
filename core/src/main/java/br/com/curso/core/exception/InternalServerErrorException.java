package br.com.curso.core.exception;

public class InternalServerErrorException extends Exception{
    private String code;
    private String message;

    public InternalServerErrorException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
