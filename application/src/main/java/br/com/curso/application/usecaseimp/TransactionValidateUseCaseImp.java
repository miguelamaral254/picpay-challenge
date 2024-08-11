package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.TransactionValidateGateway;
import br.com.curso.core.TransactionPinValidateUseCase;
import br.com.curso.core.domain.TransactionPin;
import br.com.curso.core.exception.TransferException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

public class TransactionValidateUseCaseImp implements TransactionPinValidateUseCase {

    private TransactionValidateGateway transactionValidateGateway;

    @Override
    public Boolean validate(TransactionPin transactionPin) throws TransferException {
        if (!transactionValidateGateway.validate(transactionPin)) {
            throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
        }
        return true;

    }
}
