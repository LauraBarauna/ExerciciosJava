package com.exerciciosjava.poo.encapsulamentointerface;

public class DescontoPercentual implements Desconto{
    @Override
    public void calcularDesconto(CarrinhoCompras carrinho, double desconto) {
        for (Produtos produto : carrinho.getProdutosList()) {
            double multiplicandoDesconto = produto.getPreco() * desconto/100;
            double descontoProduto = produto.getPreco() - multiplicandoDesconto;
            System.out.println("O valor do produto " + produto.getNomeProduto() + " era: " + produto.getPreco() + " e com desconto percentual ficou: " + descontoProduto);
        }
    }
}
