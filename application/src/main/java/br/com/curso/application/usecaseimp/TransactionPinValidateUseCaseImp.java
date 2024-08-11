package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.TransactionValidateGateway;
import br.com.curso.core.TransactionPinValidateUseCase;
import br.com.curso.core.UpdateTransactionPinUseCase;
import br.com.curso.core.domain.TransactionPin;
import br.com.curso.core.exception.PinException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

public class TransactionPinValidateUseCaseImp implements TransactionPinValidateUseCase {
    private TransactionValidateGateway transactionValidateGateway;
    private UpdateTransactionPinUseCase updateTransactionPinUseCase;

    public TransactionPinValidateUseCaseImp(TransactionValidateGateway transactionValidateGateway, UpdateTransactionPinUseCase updateTransactionPinUseCase) {
        this.transactionValidateGateway = transactionValidateGateway;
        this.updateTransactionPinUseCase = updateTransactionPinUseCase;
    }

    @Override
    public Boolean validate(TransactionPin transactionPin) throws PinException {

        if (transactionPin.getBlocked()) throw new PinException(ErrorCodeEnum.PIN0001.getCode(), ErrorCodeEnum.PIN0001.getMessage());
        if (transactionValidateGateway.validate(transactionPin)) {
            transactionPin.setAttempt();
            var transactionPinUpdated = updateTransactionPinUseCase.update(transactionPin);
            throw new PinException(ErrorCodeEnum.pin0002GetMessage(transactionPinUpdated.getAttempt()) , ErrorCodeEnum.PIN0002.getCode());
        }
        if (transactionPin.getAttempt() < 3) {
            transactionPin.restaureAttempt();
            updateTransactionPinUseCase.update(transactionPin);
        }

        return true;
    }
}
