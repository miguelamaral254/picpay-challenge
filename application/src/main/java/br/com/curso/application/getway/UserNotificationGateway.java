package br.com.curso.application.getway;

import br.com.curso.core.domain.Transaction;


public interface UserNotificationGateway {
    Boolean notificate(Transaction transaction, String email);
}
