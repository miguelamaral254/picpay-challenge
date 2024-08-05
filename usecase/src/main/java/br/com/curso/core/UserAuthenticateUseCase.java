package br.com.curso.core;

import br.com.curso.core.exception.AuthenticateException;

public interface UserAuthenticateUseCase {
    Boolean authenticated(String username, String password) throws AuthenticateException;
}
