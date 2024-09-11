package br.com.curso.infrastructure.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TransactionPin")
public class TransactionPinEntity {
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Pin", nullable = false)
    private String pin;
    @Column(name = "Attempt", nullable = false)
    private int attempt;
    @Column(name = "Blocked", nullable = false)
    private boolean blocked;
    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime CreatedAt;
    @Column(name = "UpdatedAt")
    private LocalDateTime UpdatedAt;

    public TransactionPinEntity(String pin, int attempt, boolean blocked, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.pin = pin;
        this.attempt = attempt;
        this.blocked = blocked;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
    }
}
