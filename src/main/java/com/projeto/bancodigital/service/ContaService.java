package com.projeto.bancodigital.service;

import com.projeto.bancodigital.model.Conta;

public class ContaService {

    public void transferir(Conta origem, Conta destino, double valor) {
        origem.transferir(valor, destino);
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void imprimirExtrato(Conta conta) {
        conta.imprimirExtrato();
    }
}