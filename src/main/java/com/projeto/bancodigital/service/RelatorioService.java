package com.projeto.bancodigital.service;


import com.projeto.bancodigital.model.Banco;
import com.projeto.bancodigital.model.Conta;

public class RelatorioService {

    public void imprimirContas(Banco banco) {
        System.out.println("== Contas registradas no banco " + banco.getNome() + " ==");
        for (Conta conta : banco.getContas()) {
            System.out.println("Conta: " + conta.getNumero()
                    + " | Cliente: " + conta.getCliente().getNome()
                    + " | Saldo: R$ " + conta.getSaldo());
        }
    }

    public void imprimirSaldoTotal(Banco banco) {
        double total = banco.getContas().stream().mapToDouble(Conta::getSaldo).sum();
        System.out.println("Saldo total no banco: R$ " + total);
    }
}