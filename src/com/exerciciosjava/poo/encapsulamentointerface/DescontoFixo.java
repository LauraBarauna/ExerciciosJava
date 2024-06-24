package com.exerciciosjava.poo.encapsulamentointerface;

public class DescontoFixo implements Desconto{
    CarrinhoCompras produtos = new CarrinhoCompras();

    @Override
    public void calcularDesconto(double desconto) {
        double valorDesconto = produtos.getPrecoProduto() - desconto;
        System.out.println("O valor era: "+produtos.getPrecoProduto()+" e com desconto fixo ficou: "+valorDesconto);
    }
}
