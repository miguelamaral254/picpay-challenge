package br.com.curso.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Inválid Tax Number", "ON-0001"),
    ON0002("Unavailable tax number", "ON-0002"),
    ON0003("Unavailable email", "ON-0003"),
    ON0004("There was an error creating the user", "ON-0004"),

    TR0001("Logist usaer doesnt have the transfer function available", "TR-0001"),
    TR0002("Unavailable balance", "TR-0002"),
    TR0003("There was an error when performing the transfer", "TR-0003"),
    TRP0001("Invalid Pin","TRP-0001"),

    WA0001("Wallet not found!","WA-0001")
;
    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
