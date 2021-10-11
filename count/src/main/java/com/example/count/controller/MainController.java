package com.example.count.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private int a;

    @PostMapping("/counter")
    public String add() {
        a += 1;
        return "Число увеличино на 1";
    }

    @GetMapping("/counter")
    public String count() {
        return Integer.toString(a);
    }

}
