package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {
    private Notificador notificador; // recebe um notificador pelo construtor

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        // TODO emitir a nota fiscal aqui
        notificador.notificar(cliente, "Nota Fiscal do produto  " + produto.getNome() + " foi emitida!");
    }
}
