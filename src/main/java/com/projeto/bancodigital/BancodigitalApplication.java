package com.projeto.bancodigital;

import com.projeto.bancodigital.model.Banco;
import com.projeto.bancodigital.model.Cliente;
import com.projeto.bancodigital.model.Conta;
import com.projeto.bancodigital.model.conta.ContaCorrente;
import com.projeto.bancodigital.model.conta.ContaPoupanca;
import com.projeto.bancodigital.service.ContaService;
import com.projeto.bancodigital.service.RelatorioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancodigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancodigitalApplication.class, args);

		Banco banco = new Banco("Banco Digital", new java.util.ArrayList<>());
		Cliente joao = new Cliente("João Silva");
		Cliente maria = new Cliente("Maria Souza");

		Conta contaJoao = new ContaCorrente(joao, banco);
		Conta contaMaria = new ContaPoupanca(maria, banco);

		ContaService contaService = new ContaService();
		RelatorioService relatorioService = new RelatorioService();

		contaService.depositar(contaJoao, 1000);
		contaService.transferir(contaJoao, contaMaria, 300);
		contaService.sacar(contaMaria, 50);

		contaService.imprimirExtrato(contaJoao);
		contaService.imprimirExtrato(contaMaria);

		relatorioService.imprimirContas(banco);
		relatorioService.imprimirSaldoTotal(banco);
	}


}
