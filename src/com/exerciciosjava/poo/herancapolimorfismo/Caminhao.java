package com.exerciciosjava.poo.herancapolimorfismo;

public class Caminhao extends Veiculo{
    //construtor
    public Caminhao(String marca, String placa, String anoFabricacao) {
        super(marca, placa, anoFabricacao);
    }

    //metodos
    @Override
    public void acelerar() {
        System.out.println("Caminhao acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Caminhao freando");
    }

    @Override
    public void torcarMarcha() {
        System.out.println("Caminhao trocando de marcha");
    }
}
