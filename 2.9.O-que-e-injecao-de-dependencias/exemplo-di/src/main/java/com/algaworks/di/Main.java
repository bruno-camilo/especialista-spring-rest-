package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.NotificacaoEmail;
import com.algaworks.di.notificacao.NotificacaoSms;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.service.AtivacaoClienteService;
import com.algaworks.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao","joao@xyz.com","3499998888");
        Cliente maria = new Cliente("Maria","maria@xyz.com","11777772222");

        Notificador notificador = new NotificacaoEmail();
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

        Produto cocaCola = new Produto("Coca-Cola", new BigDecimal(15.00));
        Produto macBook = new Produto("macbook air m2", new BigDecimal(1079.00));

        EmissaoNotaFiscalService emissao = new EmissaoNotaFiscalService(notificador);
        emissao.emitir(joao,cocaCola);
        emissao.emitir(maria,macBook);


    }
}