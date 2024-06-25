package com.exerciciosjava.poo.encapsulamentointerface;

public class DescontoFixo implements Desconto {


    //atributs
    @Override
    public void calcularDesconto(CarrinhoCompras carrinho, double desconto, String nome) {
        boolean verificarProduto = false;
        for (Produtos produto : carrinho.getProdutosList()) {
            if (produto.getNomeProduto().equalsIgnoreCase(nome)){
                double valorDesconto = produto.getPreco() - desconto;
                System.out.println("O valor do produto " + produto.getNomeProduto() + " era: " + produto.getPreco() + " e com desconto fixo de: "+desconto+" ficou: " + valorDesconto);
                verificarProduto = true;
            }
        }
        if (!verificarProduto){
            System.out.println("Esse produto não existe!");
        }
    }
}
