package br.com.ensinogameficado.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteController {

    @GetMapping
    public String start(){
        return "TESTE";
    }
}
