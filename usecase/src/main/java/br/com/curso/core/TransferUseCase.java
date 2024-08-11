package br.com.curso.core;

import br.com.curso.core.exception.*;

import java.math.BigDecimal;

public interface TransferUseCase {
    Boolean transfer(String fromTaxNumber,String toTaxNumber, BigDecimal amount, String pin) throws InternalServerErrorException, TransferException, NotFoundException, NotificationException, PinException;
}
