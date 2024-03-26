package com.aula06.olaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa q é uma classe controller que vai ter essas operações:
public class OlaController {
    @GetMapping("/ola")
    public String getOlaMundo() {
        return "Olá Mundo";
    }
}
