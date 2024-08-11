package br.com.curso.core.exception;

public class PinException extends Exception{
    private String code;
    private String message;

    public PinException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
