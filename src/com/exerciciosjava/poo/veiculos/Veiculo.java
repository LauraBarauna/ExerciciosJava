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
    public void acelerar(){}
    public void frear(){}
    public void torcarMarcha(){}
    public void exibirInfos(){
        System.out.println("Marca: "+marca);
        System.out.println("Placa: "+placa);
        System.out.println("Ano de Fabricação: "+anoFabricacao);
    }
}
