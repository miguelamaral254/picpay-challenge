package br.com.curso.infrastructure.mapper;

import br.com.curso.core.domain.User;
import br.com.curso.infrastructure.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity toUserEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getTaxNumber().getValue(),
                user.getFullNome(),
                user.getType(),
                user.getCreatedAt(),
                user.getUpdateddAt()
        );
    }
}
