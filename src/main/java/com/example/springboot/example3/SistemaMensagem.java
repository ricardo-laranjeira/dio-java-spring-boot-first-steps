package com.example.springboot.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreplay;
    @Autowired
    private Remetente financeiro;

    public void envirConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Cadastro aprovado!");
    }

    public void envirMensagemBoasVindas(){
        financeiro.setEmail("finaceiro@teste.com");
        System.out.println(financeiro);
        System.out.println("Bem vindo!");
    }
}
