package com.exerciciosjava.poo.encapsulamentointerface;

public class DescontoPercentual implements Desconto{
    @Override
    public void calcularDesconto(CarrinhoCompras carrinho, double desconto, String nome) {
        boolean verificarProduto = false;
        for (Produtos produto : carrinho.getProdutosList()) {
            if (produto.getNomeProduto().equalsIgnoreCase(nome)){
                double multiplicandoDesconto = produto.getPreco() * desconto/100;
                double descontoProduto = produto.getPreco() - multiplicandoDesconto;
                System.out.println("O valor do produto " + produto.getNomeProduto() + " era: " + produto.getPreco() + " e com desconto percentual de: " +desconto+" ficou: " + descontoProduto);
                verificarProduto = true;
                break;
            }
        }
        if (!verificarProduto){
            System.out.println("Esse produto não existe!");
        }
    }
}
