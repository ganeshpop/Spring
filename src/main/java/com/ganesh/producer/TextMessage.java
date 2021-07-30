package com.ganesh.producer;

public class TextMessage implements Message{
    @Override
    public void sendMessage(String from, String to) {
        System.out.println("Sent Text Message\n" + "'Good Morning' from "+ from + " to " + to);
        System.out.println("-------------------------------------------------------");
    }
}
