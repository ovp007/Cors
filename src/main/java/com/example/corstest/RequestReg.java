package com.example.corstest;

public class RequestReg {

    public final String username;
    public final String password;
    public final String email;

    public RequestReg(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
