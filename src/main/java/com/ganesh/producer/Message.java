package com.ganesh.producer;

public interface Message {
    void sendMessage(String from, String to);
}
