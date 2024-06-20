package poo.loja;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarProduto("Banana", 3.90, 10);
        loja.adicionarProduto("Banana", 3.90, 10);
        loja.adicionarProduto("Banana", 3.90, 20);
        loja.adicionarProduto("Maça", 2.90, 0);
        loja.ListarLista();
        loja.calcularQuantidadeEstoque("Banana");
        loja.removerProduto("Banana");
        loja.ListarLista();
        loja.calcularQuantidadeEstoque("Banana");
    }
}
