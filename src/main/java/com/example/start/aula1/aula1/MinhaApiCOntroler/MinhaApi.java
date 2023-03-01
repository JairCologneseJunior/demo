package com.example.start.aula1.aula1.MinhaApiCOntroler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhaApi {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
