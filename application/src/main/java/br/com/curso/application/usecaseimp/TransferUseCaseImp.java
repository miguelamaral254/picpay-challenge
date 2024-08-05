package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.TransferGateway;
import br.com.curso.core.*;
import br.com.curso.core.domain.Transaction;
import br.com.curso.core.domain.Wallet;
import br.com.curso.core.exception.InternalServerErrorException;
import br.com.curso.core.exception.NotFoundException;
import br.com.curso.core.exception.TransferException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

import java.math.BigDecimal;

public class TransferUseCaseImp implements TransferUseCase {

    private FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase;
    private TransactionValidateUseCase transactionValidateUseCase;
    private CreateTransactionUseCase createTransactionUseCase;
    private TransferGateway transferGateway;
    private UserNotificationUseCase userNotificationUseCase;

    public TransferUseCaseImp(FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase, TransactionValidateUseCase transactionValidateUseCase, CreateTransactionUseCase createTransactionUseCase, TransferGateway transferGateway, UserNotificationUseCase userNotificationUseCase) {
        this.findWalletByTaxNumberUseCase = findWalletByTaxNumberUseCase;
        this.transactionValidateUseCase = transactionValidateUseCase;
        this.createTransactionUseCase = createTransactionUseCase;
        this.transferGateway = transferGateway;
        this.userNotificationUseCase = userNotificationUseCase;
    }

    @Override
    public Boolean transfer(String fromTaxNumber,String toTaxNumber, BigDecimal amount ) throws InternalServerErrorException, TransferException, NotFoundException {
        Wallet from = findWalletByTaxNumberUseCase.findByTaxNumber(fromTaxNumber);
        Wallet to = findWalletByTaxNumberUseCase.findByTaxNumber(toTaxNumber);


        from.transfer(amount);
        to.receiveTransfer(amount);


        Transaction transaction = createTransactionUseCase.create(new Transaction(from,to,amount));

        transactionValidateUseCase.validate(transaction);

        if (!transferGateway.transfer(transaction)) {
            throw new InternalServerErrorException(ErrorCodeEnum.TR0003.getCode(), ErrorCodeEnum.TR0003.getMessage());
        }
        if (!userNotificationUseCase.notificate(transaction, to.getUser().getEmail())){
            throw new NotFoundException(ErrorCodeEnum.TR0002.getCode(), ErrorCodeEnum.TR0002.getMessage());
        }
        return true;
    }
}
