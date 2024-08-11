package br.com.curso.core;

import br.com.curso.core.domain.TransactionPin;
import br.com.curso.core.exception.PinException;
import br.com.curso.core.exception.TransferException;

public interface TransactionPinValidateUseCase {
    Boolean validate(TransactionPin transactionPin) throws TransferException, PinException;
}
