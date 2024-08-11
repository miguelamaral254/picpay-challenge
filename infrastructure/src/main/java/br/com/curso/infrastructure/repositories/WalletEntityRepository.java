package br.com.curso.infrastructure.repositories;

import br.com.curso.infrastructure.entities.TransactionPinEntity;
import br.com.curso.infrastructure.entities.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletEntityRepository extends JpaRepository<WalletEntity, Long> {}
