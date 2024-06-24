package com.exerciciosjava.poo.encapsulamentointerface;

import java.util.ArrayList;

public class CarrinhoCompras {
    //atributos
    ArrayList<Produtos> produtosList;
    private String nome;
    private Double precoProduto;
    private int quantidadeProduto;
    DescontoFixo descontoFixo = new DescontoFixo();

    //construtor
    public CarrinhoCompras() {
        this.produtosList = new ArrayList<>();
    }

    //metodos
    public void adicionarProdutos(String nomeProduto, Double preco, int quantidade){
        Produtos produtos = new Produtos(nomeProduto, preco, quantidade);
        produtosList.add(produtos);
        nome = nomeProduto;
        precoProduto = preco;
        quantidadeProduto = quantidade;
    }

    public void calcularDescontoFixo(double desconto){
        descontoFixo.calcularDesconto(desconto);
    }

    public void calcularDescontoPercentual(){

    }

    //get
    public String getNome() {
        return nome;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
}
