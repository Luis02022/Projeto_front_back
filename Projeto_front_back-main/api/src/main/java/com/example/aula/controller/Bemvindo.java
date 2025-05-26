package com.example.aula.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Bemvindo {
    @GetMapping
    public String bemvindo() {
        return "Bem-vindo ao sistema de gerenciamento de jogadores!";
    }
}
