package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.TransferGateway;
import br.com.curso.core.CreateTransactionUseCase;
import br.com.curso.core.FindWalletByTaxNumberUseCase;
import br.com.curso.core.TransactionValidateUseCase;
import br.com.curso.core.TransferUseCase;
import br.com.curso.core.domain.Transaction;
import br.com.curso.core.domain.Wallet;
import br.com.curso.core.exception.InternalServerErrorException;
import br.com.curso.core.exception.TransferException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

import java.math.BigDecimal;

public class TransferUseCaseImp implements TransferUseCase {

    private FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase;
    private TransactionValidateUseCase transactionValidateUseCase;
    private CreateTransactionUseCase createTransactionUseCase;
    private TransferGateway transferGateway;

    public TransferUseCaseImp(FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase, TransactionValidateUseCase transactionValidateUseCase, CreateTransactionUseCase createTransactionUseCase, TransferGateway transferGateway) {
        this.findWalletByTaxNumberUseCase = findWalletByTaxNumberUseCase;
        this.transactionValidateUseCase = transactionValidateUseCase;
        this.createTransactionUseCase = createTransactionUseCase;
        this.transferGateway = transferGateway;
    }

    @Override
    public Boolean transfer(String fromTaxNumber,String toTaxNumber, BigDecimal amount ) throws InternalServerErrorException, TransferException {
        Wallet from = findWalletByTaxNumberUseCase.findByTaxNumber(fromTaxNumber);
        Wallet to = findWalletByTaxNumberUseCase.findByTaxNumber(toTaxNumber);


        from.transfer(amount);
        to.receiveTransfer(amount);


        Transaction transaction = createTransactionUseCase.create(new Transaction(from,to,amount));

        transactionValidateUseCase.validate(transaction);

        if (!transferGateway.transfer(transaction)) {
            throw new InternalServerErrorException(ErrorCodeEnum.TR0003.getCode(), ErrorCodeEnum.TR0003.getMessage());
        }




        return true;
    }
}
