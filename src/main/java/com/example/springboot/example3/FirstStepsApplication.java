package com.example.springboot.example3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstStepsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstStepsApplication.class);
    }

    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
        return args -> {
            sistema.envirConfirmacaoCadastro();
            sistema.envirMensagemBoasVindas();
        };
    }
}
