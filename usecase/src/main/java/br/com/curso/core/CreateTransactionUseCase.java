package br.com.curso.core;

import br.com.curso.core.domain.Transaction;

public interface CreateTransactionUseCase {
    void crate(Transaction transaction);
}
