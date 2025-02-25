package com.cyrils.tutorial.tutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MessageController {
    private String message;

    /* http://localhost:8080/message?param=cyril */
    @GetMapping("/message")
    public String getMethodName(@RequestParam String param) {
        return new String("Hello " + param);
    }
    @GetMapping("/hello")
    public String getMessage() {
        return "Hello World";
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
