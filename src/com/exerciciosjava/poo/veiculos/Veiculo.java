package com.exerciciosjava.poo.veiculos;

public abstract class Veiculo {
    //atibutos
    protected String marca;
    protected String placa;
    protected String anoFabricacao;

    //construtor
    public Veiculo(String marca, String placa, String anoFabricacao) {
        this.marca = marca;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    //metodos

}
