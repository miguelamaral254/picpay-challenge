package br.com.curso.core;

import br.com.curso.core.domain.Transaction;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction);
}
