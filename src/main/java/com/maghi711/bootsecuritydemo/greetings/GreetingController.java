package com.maghi711.bootsecuritydemo.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Map<String, String> getCurrentTime(String name) {
        return Map.of("message", "Hello, the time now is " + LocalDateTime.now());
    }
}
