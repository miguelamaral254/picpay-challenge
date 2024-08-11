package br.com.curso.application.getway;

import br.com.curso.core.domain.TransactionPin;

public interface TransactionValidateGateway {
    Boolean validate(TransactionPin transactionPin);
}
