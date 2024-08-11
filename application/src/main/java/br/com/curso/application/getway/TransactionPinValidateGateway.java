package br.com.curso.application.getway;

import br.com.curso.core.domain.Transaction;

public interface TransactionPinValidateGateway {
    boolean validate(Transaction transaction);
}
