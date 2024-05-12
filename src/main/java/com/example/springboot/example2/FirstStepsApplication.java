package com.example.springboot.example2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstStepsApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.springboot.example2.FirstStepsApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception{
        return args -> {
            String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados cep: " + response);
        };
    }
}
