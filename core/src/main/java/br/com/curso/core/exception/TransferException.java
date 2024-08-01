package br.com.curso.core.exception;

public class TransferException extends Exception {
    private String code;
    public TransferException(String mensagem, String code) {
        super(mensagem);
        this.code = code;
    }
}
