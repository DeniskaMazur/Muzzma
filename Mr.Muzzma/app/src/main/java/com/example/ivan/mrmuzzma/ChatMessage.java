package com.example.ivan.mrmuzzma;

public class ChatMessage {
    public boolean left;
    public boolean chose = false;
    public String message;

    public ChatMessage(boolean left, String message) {
        super();
        this.left = left;
        this.message = message;
    }
}
