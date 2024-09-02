package com.example.rabbitproject;

public class Receiver {
    public static final String RECEIVE_METHOD_NAME = "receiveMessage";

    public void receiveMessage(String message) {
        System.out.println("[Receptor] ha recibido el mensaje \"" + message + '"');
    }
}
