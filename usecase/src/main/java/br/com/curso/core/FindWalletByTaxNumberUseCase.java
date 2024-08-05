package br.com.curso.core;


import br.com.curso.core.domain.Wallet;
import br.com.curso.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {
    Wallet findByTaxNumber(String taxNumber) throws NotFoundException;
}
