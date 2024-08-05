package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.UserAuthenticateGateway;
import br.com.curso.core.UserAuthenticateUseCase;
import br.com.curso.core.exception.AuthenticateException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

public class UserAuthenticateUseCaseImp implements UserAuthenticateUseCase {
    private UserAuthenticateGateway userAuthenticateGateway;

    public UserAuthenticateUseCaseImp(UserAuthenticateGateway userAuthenticateGateway) {
        this.userAuthenticateGateway = userAuthenticateGateway;
    }

    @Override
    public Boolean authenticated(String username, String password) throws AuthenticateException {

        if(!userAuthenticateGateway.authenticate(username, password)){
            throw new AuthenticateException(ErrorCodeEnum.ATH0001.getCode(),ErrorCodeEnum.ATH0001.getMessage());
        }
        return true;
    }
}
