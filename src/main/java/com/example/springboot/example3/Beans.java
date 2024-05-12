package com.example.springboot.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype") // duas referencias
    public Remetente remetente(){
        System.out.println("Criando um objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("teste@teste.com");
        remetente.setNome("Teste");
        return remetente;
    }
}
