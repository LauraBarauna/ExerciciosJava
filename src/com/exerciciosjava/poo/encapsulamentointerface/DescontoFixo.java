package com.exerciciosjava.poo.encapsulamentointerface;

public class DescontoFixo implements Desconto {


    //atributs
    @Override
    public void calcularDesconto(CarrinhoCompras carrinho, double desconto) {
        for (Produtos produto : carrinho.getProdutosList()) {
            double valorDesconto = produto.getPreco() - desconto;
            System.out.println("O valor do produto " + produto.getNomeProduto() + " era: " + produto.getPreco() + " e com desconto fixo ficou: " + valorDesconto);
        }
    }
}
