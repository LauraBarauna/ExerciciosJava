package com.exerciciosjava.poo.carteiraDigital;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    double saldo;
    double limiteSaldo;
    List<String> historico;

    //construtor
    public CarteiraDigital(double saldo, double limiteSaldo) {
        this.saldo = saldo;
        this.limiteSaldo = limiteSaldo;
        this.historico = new ArrayList<>();
        this.historico.add(String.format("Inicialização: %.2f", saldo));

    }

    public void adicionar(double valor){
        saldo += valor;
        historico.add(String.format("Adicionado: %.2f, Saldo: %.2f", valor, saldo));
        System.out.println("Valor adicionado.");
        imprimirSaldo();
    }

    public void retirar(double valor) {
        // Verificar se a retirada não ultrapassa o limite de saldo negativo
        if (saldo - valor >= -limiteSaldo) {
            saldo -= valor;
            historico.add(String.format("Retirado: %.2f, Saldo: %.2f", valor, saldo));
            System.out.println("Valor retirado.");
        } else {
            System.out.println("Saldo insuficiente. Retirada não realizada.");
        }
        imprimirSaldo();
    }

    public void imprimirSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    public void imprimirHistorico(){
        System.out.println("Histórico de transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }

    }
}
