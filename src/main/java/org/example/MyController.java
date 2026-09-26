package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Привет, Мир!";
    }

    @GetMapping("/number")
    public int getNumber() {
        return 5101;
    }
}