package com.exerciciosjava.poo.herancapolimorfismo;

public class Moto extends Veiculo{
    //construtor
    public Moto(String marca, String placa, String anoFabricacao) {
        super(marca, placa, anoFabricacao);
    }

    //metodos
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }

    @Override
    public void torcarMarcha() {
        System.out.println("Moto trocando de marcha");
    }
}
