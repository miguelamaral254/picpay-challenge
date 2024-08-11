package br.com.curso.infrastructure.entities;


import br.com.curso.core.domain.enums.TransactionStatusEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transactions")
public class TransactionEntity {
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "FromWallet")
    private WalletEntity FromWallet;
    @ManyToOne()
    @JoinColumn(name = "ToWallet")
    private WalletEntity toWallet;
    @Column(name = "TransactionValue", nullable = false)
    private BigDecimal value;
    @Column(name = "Status", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionStatusEnum status;
    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime CreatedAt;
    @Column(name = "UpdatedAt", nullable = false)
    private LocalDateTime UpdatedAt;
}
