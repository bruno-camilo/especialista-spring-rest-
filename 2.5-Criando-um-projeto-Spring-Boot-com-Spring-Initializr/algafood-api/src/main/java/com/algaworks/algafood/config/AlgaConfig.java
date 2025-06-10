package com.algaworks.algafood.config;

import com.algaworks.algafood.notificador.NotificadorEmail;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@Configuration // Usado para definir os beans gerenciados pelo IoC
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificadorEmai = new NotificadorEmail("smtp.algamail.com.br");
        notificadorEmai.setCaixaAlta(true);
        return notificadorEmai;
    }
    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }
}
