package com.ganesh.producer;

public class EmailMessage implements Message{
    @Override
    public void sendMessage(String from, String to) {
        System.out.println("Sent Email Message\n" + "'Good Morning' from "+ from + " to " + to);
        System.out.println("-------------------------------------------------------");
    }
}
