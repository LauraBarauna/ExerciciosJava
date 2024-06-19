package collections.arrayList.manipulacao.loja;

import java.util.ArrayList;

public class Loja {
    //atributos
    ArrayList<Produto> produtosList;

    //construtor
    public Loja() {
        this.produtosList = new ArrayList<>();
    }

    //metodos
    public void adicionarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        produtosList.add(produto);
    }

    public void calcularQuantidadeEstoque(String nome){
        int soma =0;
        if (!produtosList.isEmpty()){
            for (Produto p: produtosList){
                if(p.getNome().equalsIgnoreCase(nome)){
                    soma += p.getQuantidade();
                }
            }
            if (soma !=0){
                System.out.println("Existem "+soma +" "+ nome+"s no estoque.");
            }else{
                System.out.println("Não temos "+nome+"s em estoque!");
            }
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public ArrayList removerProduto (String nome){
        ArrayList itensRemover = new ArrayList<>();
        if (!produtosList.isEmpty()){
            for (Produto p:produtosList){
                if (p.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(p);
                }
            }
        }
        produtosList.removeAll(itensRemover);
        return produtosList;
    }

    public void ListarLista(){
        System.out.println(produtosList);
    }


}



