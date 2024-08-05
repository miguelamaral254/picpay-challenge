package br.com.curso.application.usecaseimp;

import br.com.curso.core.UserNotificationUseCase;
import br.com.curso.core.domain.Transaction;


public class UserNotificationUseCaseImp implements UserNotificationUseCase {
    private UserNotificationUseCase userNotificationUseCase;

    public UserNotificationUseCaseImp(UserNotificationUseCase userNotificationUseCase) {
        this.userNotificationUseCase = userNotificationUseCase;
    }

    @Override
    public Boolean notificate(Transaction transaction, String email) {
        return userNotificationUseCase.notificate(transaction, email);
    }
}
