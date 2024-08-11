package br.com.curso.core;

import br.com.curso.core.domain.TransactionPin;

public interface UpdateTransactionPinUseCase {
    TransactionPin update(TransactionPin transactionPin);
}
