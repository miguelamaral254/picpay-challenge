package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.FindWalletByTaxNumberGateway;
import br.com.curso.core.FindWalletByTaxNumberUseCase;
import br.com.curso.core.domain.Wallet;
import br.com.curso.core.exception.NotFoundException;
import br.com.curso.core.exception.enums.ErrorCodeEnum;

public class FindWalletByTaxNumberUseCaseImp implements FindWalletByTaxNumberUseCase {

    private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;

    public FindWalletByTaxNumberUseCaseImp(FindWalletByTaxNumberGateway findWalletByTaxNumberGateway) {
        this.findWalletByTaxNumberGateway = findWalletByTaxNumberGateway;
    }

    @Override
    public Wallet findByTaxNumber(String taxNumber) throws NotFoundException {
        var wallet = findWalletByTaxNumberGateway.findByTaxNumber(taxNumber);

        if (wallet == null) {
            throw new NotFoundException(ErrorCodeEnum.WA0001.getCode(), ErrorCodeEnum.WA0001.getMessage());
        }

        return wallet;
    }
}
