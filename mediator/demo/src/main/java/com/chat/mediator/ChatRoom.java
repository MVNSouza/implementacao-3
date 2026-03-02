package com.chat.mediator;

import java.util.ArrayList;
import java.util.List;

import com.chat.user.User;

// Concrete Mediator: implementa a lógica de distribuição das mensagens entre os usuários.

public class ChatRoom implements ChatMediator {

    private List<User> users;


    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Não envia para quem mandou
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}