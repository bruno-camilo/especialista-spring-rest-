package com.algaworks.algafood.config;

import com.algaworks.algafood.notificador.Notificador;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Classe utilizada para definir, instanciar e ser gerenciada pelo IoC
 */

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
