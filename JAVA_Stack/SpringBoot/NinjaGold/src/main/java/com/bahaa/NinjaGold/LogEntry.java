package com.bahaa.NinjaGold;

public class LogEntry {
    private String message;
    private String color;

    public LogEntry(String message, String color) {
        this.message = message;
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public String getColor() {
        return color;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setColor(String color) {
        this.color = color;
    }
}