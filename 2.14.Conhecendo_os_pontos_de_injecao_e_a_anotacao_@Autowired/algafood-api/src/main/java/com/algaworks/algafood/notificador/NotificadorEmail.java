package com.algaworks.algafood.notificador;

import com.algaworks.algafood.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s:  %s\n", cliente.getNome() , cliente.getEmail(), mensagem);
    }
}
