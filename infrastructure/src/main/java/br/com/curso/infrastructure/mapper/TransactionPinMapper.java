package br.com.curso.infrastructure.mapper;

import br.com.curso.core.domain.TransactionPin;
import br.com.curso.infrastructure.entities.TransactionPinEntity;
import org.springframework.stereotype.Component;

@Component
public class TransactionPinMapper {
    public TransactionPinEntity toTransactionPin(TransactionPin transactionPin) {
        return new TransactionPinEntity(
                transactionPin.getPin(),
                transactionPin.getAttempt(),
                transactionPin.getBlocked(),
                transactionPin.getCreatedAt(),
                transactionPin.getUpdatedAt()
        );
    }
}
