package com.example.corstest;

public class Request {

    public final String username;
    public final String password;
    public final String code;

    public Request(String username, String password, String code) {
        this.username = username;
        this.password = password;
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return code;
    }
}
