package com.exerciciosjava.collections.arraylist.manipulacao.loja;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome , double preco, int quantidade) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    //get
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //to string
    @Override
    public String toString() {
        return "com.exerciciosjava.collections.arraylist.manipulacao.loja.Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
