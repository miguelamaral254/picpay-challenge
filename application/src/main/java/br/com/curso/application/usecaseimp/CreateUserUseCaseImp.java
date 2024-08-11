package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.CreateUserGateway;
import br.com.curso.core.*;
import br.com.curso.core.domain.TransactionPin;
import br.com.curso.core.domain.User;
import br.com.curso.core.domain.Wallet;
import br.com.curso.core.exception.EmailException;
import br.com.curso.core.exception.InternalServerErrorException;
import br.com.curso.core.exception.TaxNumberException;
import br.com.curso.core.exception.TransactionPinException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

import java.math.BigDecimal;

public class CreateUserUseCaseImp implements CreateUserUseCase {

    private TaxNumberAvailableUseCaseImp taxNumberAvailableUseCaseImp;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;

    public CreateUserUseCaseImp(TaxNumberAvailableUseCaseImp taxNumberAvailableUseCaseImp,
                                EmailAvailableUseCase emailAvailableUseCase,
                                CreateUserGateway createUserGateway)
    {
        this.taxNumberAvailableUseCaseImp = taxNumberAvailableUseCaseImp;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
    }
    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException {
        if (!taxNumberAvailableUseCaseImp.isTaxNumberAvailable(user.getTaxNumber().getValue())){
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getCode(), ErrorCodeEnum.ON0002.getMessage());
        }
        if (!emailAvailableUseCase.isEmailAvailable(user.getEmail())){
            throw new EmailException(ErrorCodeEnum.ON0003.getCode(), ErrorCodeEnum.ON0003.getMessage());
        }

        if (!createUserGateway.create(user, new Wallet(new TransactionPin(pin),BigDecimal.ZERO,user))) {
            throw new InternalServerErrorException(ErrorCodeEnum.ON0004.getCode(), ErrorCodeEnum.ON0004.getMessage());
        }
    }
}
