package com.chat.user;

import com.chat.mediator.ChatMediator;

// Colleague Abstrato: representa um participante que se comunica apenas através do Mediator.
public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}