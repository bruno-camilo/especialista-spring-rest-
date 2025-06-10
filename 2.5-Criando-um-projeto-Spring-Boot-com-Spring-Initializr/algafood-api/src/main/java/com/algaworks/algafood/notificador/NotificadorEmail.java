package com.algaworks.algafood.notificador;

import com.algaworks.algafood.modelo.Cliente;
import org.springframework.stereotype.Component;

// @Component // forma do Spring Ioc gerencie a classe
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail");
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }


    @Override
    public void notificar(Cliente cliente, String mensagem){
        if(this.caixaAlta)
            mensagem = mensagem.toUpperCase();
        System.out.printf("Notificando %s através do e-mail %s: usando o SMTP %s:  %s\n", cliente.getNome() , cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }
}
