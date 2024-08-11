package br.com.curso.infrastructure.entities;

import br.com.curso.core.domain.enums.UserTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.usertype.UserType;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Users")
public class UserEntity {
    @Column(name = "Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "TaxNumber", nullable = false)
    private String TaxNumber;
    @Column(name = "FullName", nullable = false)
    private String FullName;
    @Column(name = "Type", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserTypeEnum Type;
    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime CreatedAt;
    @Column(name = "UpdatedAt", nullable = false)
    private LocalDateTime UpdatedAt;


}
