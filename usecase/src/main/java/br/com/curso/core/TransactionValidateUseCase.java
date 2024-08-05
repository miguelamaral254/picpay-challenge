package br.com.curso.core;

import br.com.curso.core.domain.Transaction;
import br.com.curso.core.exception.TransferException;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction) throws TransferException;
}
