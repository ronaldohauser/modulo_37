package com.modulo37;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/user")
    public User user() {
        return new User("Ronaldo", 33);
    }
}
