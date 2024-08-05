package br.com.curso.application.usecaseimp;

import br.com.curso.application.getway.TaxNumberAvailableGateway;
import br.com.curso.core.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImp implements TaxNumberAvailableUseCase {

    private TaxNumberAvailableGateway taxNumberAvailableGateway;

    public TaxNumberAvailableUseCaseImp(TaxNumberAvailableGateway taxNumberAvailableGateway) {
        this.taxNumberAvailableGateway = taxNumberAvailableGateway;
    }

    @Override
    public boolean isTaxNumberAvailable(String taxNumber) {
        return taxNumberAvailableGateway.isTaxNumberAvailable(taxNumber);
    }
}
