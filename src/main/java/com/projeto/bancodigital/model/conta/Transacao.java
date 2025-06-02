package com.projeto.bancodigital.model.conta;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data = LocalDateTime.now();

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + data + "] " + tipo + ": R$ " + valor;
    }
}