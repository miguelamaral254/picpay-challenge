package br.com.curso.core;

import br.com.curso.core.domain.User;

public interface FindUserByTaxNumberUseCase {
    User findUserByTaxNumber(String taxNumber);
}
