package br.com.curso.infrastructure.repositories;

import br.com.curso.infrastructure.entities.TransactionPinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionPinEntityRepository extends JpaRepository<TransactionPinEntity, Long> {
    


}
