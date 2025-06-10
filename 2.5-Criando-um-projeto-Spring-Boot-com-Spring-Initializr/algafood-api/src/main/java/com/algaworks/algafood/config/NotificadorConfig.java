package com.algaworks.algafood.config;

import com.algaworks.algafood.notificador.Notificador;
import com.algaworks.algafood.notificador.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Classe utilizada para definir, instanciar e ser gerenciada pelo IoC
 */
@Configuration
public class NotificadorConfig {

    @Bean
    public Notificador notificadorEmail(){
        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
        notificadorEmail.setCaixaAlta(true);
        return notificadorEmail;
    }
}
