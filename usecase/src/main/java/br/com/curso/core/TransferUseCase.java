package br.com.curso.core;

import br.com.curso.core.domain.Transaction;

public interface TransferUseCase {
    Boolean transfer(Transaction transaction);
}
