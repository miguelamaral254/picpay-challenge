package br.com.curso.core;

import br.com.curso.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
