package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.ConsultBalanceGateway;
import br.com.curso.core.ConsultBalanceUseCase;
import br.com.curso.core.domain.Wallet;

import java.math.BigDecimal;

public class ConsultBalanceUseCaseImp implements ConsultBalanceUseCase {
    private ConsultBalanceGateway consultBalanceGateway;

    public ConsultBalanceUseCaseImp(ConsultBalanceGateway consultBalanceGateway) {
        this.consultBalanceGateway = consultBalanceGateway;
    }

    @Override
    public BigDecimal consult(Wallet wallet) {
        return consultBalanceGateway.consultBalance(wallet);
    }
}
