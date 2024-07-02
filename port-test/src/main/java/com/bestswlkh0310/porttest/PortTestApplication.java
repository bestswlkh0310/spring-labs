package com.bestswlkh0310.porttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PortTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortTestApplication.class, args);
    }

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
