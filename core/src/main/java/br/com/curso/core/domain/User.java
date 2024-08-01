package br.com.curso.core.domain;

import br.com.curso.core.domain.enums.UserTypeEnum;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID id;
    private String email;
    private String password;
    private TaxNumber taxNumber;
    private String fullNome;
    private UserTypeEnum type;
    private TransactionPin transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime updateddAt;

    public User(UUID id, String email, String password, TaxNumber taxNumber, String fullNome, UserTypeEnum type, TransactionPin transactionPin, LocalDateTime createdAt, LocalDateTime updateddAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullNome = fullNome;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.updateddAt = updateddAt;
    }

    public User(String email, String password, TaxNumber taxNumber, String fullNome, UserTypeEnum type, TransactionPin transactionPin) {
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullNome = fullNome;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = LocalDateTime.now();
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullNome() {
        return fullNome;
    }

    public void setFullNome(String fullNome) {
        this.fullNome = fullNome;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public TransactionPin getTransactionPin() {
        return transactionPin;
    }

    public void setTransactionPin(TransactionPin transactionPin) {
        this.transactionPin = transactionPin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateddAt() {
        return updateddAt;
    }

    public void setUpdateddAt(LocalDateTime updateddAt) {
        this.updateddAt = updateddAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(taxNumber, user.taxNumber) && Objects.equals(fullNome, user.fullNome) && type == user.type && Objects.equals(transactionPin, user.transactionPin) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updateddAt, user.updateddAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, taxNumber, fullNome, type, transactionPin, createdAt, updateddAt);
    }
}
