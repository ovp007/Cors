package com.example.corstest;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Response {

    public final String token;

    @JsonCreator
    public Response(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
