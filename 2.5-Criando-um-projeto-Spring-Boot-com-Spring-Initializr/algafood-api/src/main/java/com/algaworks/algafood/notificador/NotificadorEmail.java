package com.algaworks.algafood.notificador;

import com.algaworks.algafood.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component // forma do Spring Ioc gerencie a classe
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome() , cliente.getEmail(), mensagem);
    }
}
