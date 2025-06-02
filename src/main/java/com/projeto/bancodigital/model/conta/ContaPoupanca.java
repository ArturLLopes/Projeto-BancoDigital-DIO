package com.projeto.bancodigital.model.conta;

import com.projeto.bancodigital.model.Banco;
import com.projeto.bancodigital.model.Cliente;
import com.projeto.bancodigital.model.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
}