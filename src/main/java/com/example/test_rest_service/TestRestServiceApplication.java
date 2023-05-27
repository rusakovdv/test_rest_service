package com.example.test_rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRestServiceApplication.class, args);
    }
}
