package com.projeto.bancodigital.model.conta;

import com.projeto.bancodigital.model.Banco;
import com.projeto.bancodigital.model.Cliente;
import com.projeto.bancodigital.model.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
}
