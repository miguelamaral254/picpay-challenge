package br.com.curso.core;

import br.com.curso.core.domain.Transaction;
import br.com.curso.core.exception.InternalServerErrorException;
import br.com.curso.core.exception.NotFoundException;
import br.com.curso.core.exception.TransferException;

import java.math.BigDecimal;

public interface TransferUseCase {
    Boolean transfer(String fromTaxNumber,String toTaxNumber, BigDecimal amount) throws InternalServerErrorException, TransferException, NotFoundException;
}
