package com.exerciciosjava.poo.carteiradigital;

import java.util.Scanner;

public class MainCarteiraDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Informe o limite de saldo");
        double limiteSaldo = scanner.nextDouble();

        CarteiraDigital carteira = new CarteiraDigital(saldoInicial, limiteSaldo);

        System.out.println("Informe o valor para adicionar: ");
        double valorAdicionar = scanner.nextDouble();
        carteira.adicionar(valorAdicionar);

        System.out.println("Informe o valor para retirar: ");
        double valorRetirar = scanner.nextDouble();
        carteira.retirar(valorRetirar);

        carteira.imprimirHistorico();

        scanner.close();


    }
}
