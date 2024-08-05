package br.com.curso.application.getway;

import br.com.curso.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceGateway {

    BigDecimal consultBalance(Wallet wallet);
}
