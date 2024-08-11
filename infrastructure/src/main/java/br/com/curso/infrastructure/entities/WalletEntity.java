package br.com.curso.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Wallet")
public class WalletEntity {
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Balance")
    private BigDecimal balance;
    @OneToOne
    @JoinColumn(name = "UserId")
    private UserEntity userEntity;
    @OneToOne
    @JoinColumn(name = "TransactionPinId")
    private UserEntity TransactionPinId;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime CreatedAt;
    @Column(name = "UpdatedAt", nullable = false)
    private LocalDateTime UpdatedAt;

}
