package com.exerciciosjava.poo.veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat","LVX-4350", "10/11/2000");
        Veiculo moto = new Moto("Honda","MZC-3498", "10/02/2010");
        Veiculo caminhao = new Caminhao("Mercedes","JTT-5115", "24/06/2005");

        carro.exibirInfos();
        caminhao.exibirInfos();
        moto.exibirInfos();
    }
}
