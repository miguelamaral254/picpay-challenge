package br.com.curso.application.usecaseimp;

import br.com.curso.core.TransactionPinValidateUseCase;
import br.com.curso.core.domain.TransactionPin;
import br.com.curso.core.exception.TransferException;

public class TransactionPinValidateUseCaseImp implements TransactionPinValidateUseCase {
    @Override
    public Boolean validate(TransactionPin transactionPin) throws TransferException {
        return null;
    }
}
