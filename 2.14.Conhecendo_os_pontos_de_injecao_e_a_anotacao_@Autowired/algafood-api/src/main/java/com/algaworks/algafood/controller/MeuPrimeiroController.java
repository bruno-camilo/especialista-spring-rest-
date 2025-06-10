package com.algaworks.algafood.controller;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // anotando a classe como controller para receber requisicoes web
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("Joao","joao@xyz.com","3499998888");
        Cliente maria = new Cliente("Maria","maria@xyz.com","11777772222");

        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);
        return "Hello!";
    }
}
