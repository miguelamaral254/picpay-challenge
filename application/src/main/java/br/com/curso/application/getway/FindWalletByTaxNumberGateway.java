package br.com.curso.application.getway;

import br.com.curso.core.domain.Wallet;

public interface FindWalletByTaxNumberGateway {
    Wallet findByTaxNumber(String taxNumber);
}
