package com.exerciciosjava.poo.encapsulamentointerface;

import java.util.ArrayList;

public class CarrinhoCompras {
    //atributos
    ArrayList<Produtos> produtosList;
    private String nome;
    private Double precoProduto;
    private int quantidadeProduto;
    private DescontoFixo descontoFixo = new DescontoFixo();
    private DescontoPercentual descontoPercentual = new DescontoPercentual();

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

    public void calcularDescontoFixo(double desconto, String nomeProduto){
       if (!produtosList.isEmpty()){
           descontoFixo.calcularDesconto(this, desconto, nomeProduto);
       } else {
           throw new RuntimeException("Lista vazia!");
       }

    }

    public void calcularDescontoPercentual(double desconto, String nomeProduto){
        if (!produtosList.isEmpty()){
            descontoPercentual.calcularDesconto(this, desconto, nomeProduto);
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void listarProdutos(){
        if (!produtosList.isEmpty()){
            System.out.println(produtosList);
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    //get
    public ArrayList<Produtos> getProdutosList() {
        return produtosList;
    }

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
