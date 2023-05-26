package com.practice.SpringProject;

import lombok.Data;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("hello avinash");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
