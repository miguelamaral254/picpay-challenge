package br.com.curso.infrastructure.repositories;

import br.com.curso.infrastructure.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, Long> {



}
