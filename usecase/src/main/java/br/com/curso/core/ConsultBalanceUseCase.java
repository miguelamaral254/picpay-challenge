package br.com.curso.core;

import br.com.curso.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceUseCase {
    BigDecimal consult(Wallet wallet);
}
