package com.exerciciosjava.poo.herancapolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", "ABC-1234", "2022"));
        veiculos.add(new Moto("Honda", "XYZ-5678", "2021"));
        veiculos.add(new Caminhao("Volvo", "MNO-9101", "2020"));

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfos();
            veiculo.acelerar();
            veiculo.frear();
            veiculo.torcarMarcha();
            System.out.println();
        }
    }
}
