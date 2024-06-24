package com.exerciciosjava.poo.veiculos;

public class Carro extends Veiculo{

    //construtor
    public Carro(String marca, String placa, String anoFabricacao) {
        super(marca, placa, anoFabricacao);
    }

    //metodos
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }

    @Override
    public void torcarMarcha() {
        System.out.println("Carro trocando de marcha");
    }
}
