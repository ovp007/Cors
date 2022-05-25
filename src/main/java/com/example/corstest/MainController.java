package com.example.corstest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(originPatterns = "http://localhost:3000", allowedHeaders ="*" )
public class MainController {

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RequestReg request){

        return new ResponseEntity<>(new Request(request.username, request.email, request.password), HttpStatus.OK);


    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Request request){

        return new ResponseEntity<>(new Response("token"), HttpStatus.OK);


    }
}
