package com.example.count;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CountApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CountApplication.class, args);
    }

}
