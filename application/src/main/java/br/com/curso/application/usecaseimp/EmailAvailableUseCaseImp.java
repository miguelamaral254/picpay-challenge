package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.EmailAvailableGateway;

import br.com.curso.core.EmailAvailableUseCase;

public class EmailAvailableUseCaseImp implements EmailAvailableUseCase {

    private EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImp(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public Boolean isEmailAvailable(String email) {
        return emailAvailableGateway.emailAvailable(email);
    }
}
