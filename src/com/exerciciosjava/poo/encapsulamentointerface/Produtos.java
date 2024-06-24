package com.exerciciosjava.poo.encapsulamentointerface;

public class Produtos {
    //atributos
    private String nomeProduto;
    private Double preco;
    private int quantidade;

    //construtor
    public Produtos(String nomeProduto, Double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //get
    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //to string
    @Override
    public String toString() {
        return "Produtos{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
