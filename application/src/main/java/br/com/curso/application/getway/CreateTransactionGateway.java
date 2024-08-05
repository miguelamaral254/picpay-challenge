package br.com.curso.application.getway;

import br.com.curso.core.domain.Transaction;

public interface CreateTransactionGateway {
    Transaction create(Transaction transaction);
}
