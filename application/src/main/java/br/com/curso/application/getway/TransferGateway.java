package br.com.curso.application.getway;

import br.com.curso.core.domain.Transaction;

public interface TransferGateway {
    Boolean transfer(Transaction transaction);
}
