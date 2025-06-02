package com.projeto.bancodigital.model;

import com.projeto.bancodigital.model.conta.Transacao;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
public abstract class Conta {
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente, Banco banco) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        this.transacoes = new ArrayList<>();
        banco.adicionarConta(this);
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor));
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            transacoes.add(new Transacao("Transferência para conta " + destino.getNumero(), valor));
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("--- Extrato da Conta " + numero + " ---");
        for (Transacao t : transacoes) {
            System.out.println(t);
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }
}