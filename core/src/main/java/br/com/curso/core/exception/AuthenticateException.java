package br.com.curso.core.exception;

public class AuthenticateException extends Exception{
    private String code;

    public AuthenticateException(String code, String message) {
        super(message);
        this.code = code;
    }
}
