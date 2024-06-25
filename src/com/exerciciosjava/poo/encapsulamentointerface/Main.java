package com.exerciciosjava.poo.encapsulamentointerface;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras produtos = new CarrinhoCompras();
        produtos.adicionarProdutos("Camisa polo", 150.0, 3);
        produtos.adicionarProdutos("Celular", 2000.0, 2);

        produtos.calcularDescontoFixo(5, "celular");
        produtos.calcularDescontoPercentual(10, "Camisa polo");

        produtos.listarProdutos();


    }
}
