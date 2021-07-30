package com.ganesh.producer;

public class SMSMessage implements Message{

    @Override
    public void sendMessage(String from, String to) {
        System.out.println("Sent SMS Message\n" + "'Good Morning' from "+ from + " to " + to);
        System.out.println("-------------------------------------------------------");

    }
}
