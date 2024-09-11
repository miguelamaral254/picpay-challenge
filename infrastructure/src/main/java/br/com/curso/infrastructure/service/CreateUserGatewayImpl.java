package br.com.curso.infrastructure.service;

import br.com.curso.application.getway.CreateUserGateway;
import br.com.curso.core.domain.User;
import br.com.curso.core.domain.Wallet;
import br.com.curso.infrastructure.entities.TransactionPinEntity;
import br.com.curso.infrastructure.mapper.TransactionPinMapper;
import br.com.curso.infrastructure.mapper.UserMapper;
import br.com.curso.infrastructure.repositories.TransactionPinEntityRepository;
import br.com.curso.infrastructure.repositories.UserEntityRepository;
import br.com.curso.infrastructure.repositories.WalletEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserGatewayImpl implements CreateUserGateway {
    private final UserEntityRepository userEntityRepository;
    private final TransactionPinEntityRepository transactionPinEntityRepository;
    private UserEntityRepository entityRepository;
    private UserMapper userMapper;
    private TransactionPinEntity transactionPinEntity;
    private TransactionPinMapper transactionPinMapper;
    private WalletEntityRepository walletEntityRepository;


    public CreateUserGatewayImpl(UserEntityRepository entityRepository, UserEntityRepository userEntityRepository, UserMapper userMapper, TransactionPinEntity transactionPinEntity, TransactionPinEntityRepository transactionPinEntityRepository, TransactionPinMapper transactionPinMapper, WalletEntityRepository walletEntityRepository) {
        this.entityRepository = entityRepository;
        this.userEntityRepository = userEntityRepository;
        this.userMapper = userMapper;
        this.transactionPinEntity = transactionPinEntity;
        this.transactionPinEntityRepository = transactionPinEntityRepository;
        this.transactionPinMapper = transactionPinMapper;
        this.walletEntityRepository = walletEntityRepository;
    }

    @Override
    public Boolean create(User user, Wallet wallet) {
        try{
            var userSaved = userEntityRepository.save(userMapper.toUserEntity(user));
            var transactionPinSaved = transactionPinEntityRepository.save(transactionPinMapper.toTransactionPin(wallet.getTransactionPin()));

        }catch (Exception e){};
        return null;
    }
}
