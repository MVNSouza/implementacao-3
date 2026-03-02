package com.chat;

import com.chat.mediator.ChatMediator;
import com.chat.mediator.ChatRoom;
import com.chat.user.ChatUser;
import com.chat.user.User;

// Cliente: configura o Mediator e os Colleagues, iniciando a comunicação no sistema.
public class Main {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Marcos");
        User user2 = new ChatUser(chatRoom, "Ana");
        User user3 = new ChatUser(chatRoom, "Carlos");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Olá pessoal!");
        System.out.println("-------------");
        user2.send("Oi Marcos!");
    }
}