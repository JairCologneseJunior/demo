package com.example.aula2.demo.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
        @GetMapping("/hello")
        public String helloWorld() {
            return "Hello World";
        }
    @GetMapping("/resultado")
    public int  soma() {

            int resultado = 1+1;
        return resultado;
    }

}
