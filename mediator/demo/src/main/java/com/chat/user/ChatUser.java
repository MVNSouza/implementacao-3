package com.chat.user;

import com.chat.mediator.ChatMediator;

// Colleague Concreto: implementa o envio e recebimento de mensagens utilizando o Mediator.
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " enviou: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " recebeu: " + message);
    }
}