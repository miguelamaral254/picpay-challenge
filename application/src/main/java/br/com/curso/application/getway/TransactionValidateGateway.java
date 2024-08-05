package br.com.curso.application.getway;

import br.com.curso.core.domain.Transaction;

public interface TransactionValidateGateway {
    Boolean validate(Transaction transaction);
}
