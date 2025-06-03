package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificacaoSms implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS atráves do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
