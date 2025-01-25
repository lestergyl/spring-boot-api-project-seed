package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("hello3");
        SpringApplication.run(Application.class, args);
    }
}

