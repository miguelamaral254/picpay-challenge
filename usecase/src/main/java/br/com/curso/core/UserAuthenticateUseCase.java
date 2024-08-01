package br.com.curso.core;

public interface UserAuthenticateUseCase {
    Boolean authenticated(String username, String password);
}
