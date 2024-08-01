package br.com.curso.core;

import br.com.curso.core.domain.TransactionPin;

public interface CreateTransactionPinUseCase {
    void create(TransactionPin transactionPin);
}
