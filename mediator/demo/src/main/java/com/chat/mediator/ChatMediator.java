package com.chat.mediator;

import com.chat.user.User;

// Interface Mediator: define o contrato de comunicação centralizada entre os usuários.
public interface ChatMediator {

    void sendMessage(String message, User sender);

    void addUser(User user);
}