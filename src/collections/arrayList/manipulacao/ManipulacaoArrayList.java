package collections.arrayList.manipulacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulacaoArrayList {
    public List<String> stringList;

    // Construtor
    public ManipulacaoArrayList() {
        this.stringList = new ArrayList<>();
    }

    // Métodos
    public void adicionarPalavra(String nome) {
        stringList.add(nome);
    }

    public void verificarSeEstaPresente(String nome) {
        boolean presente = false;
        for (String s : stringList) {
            if (s.equalsIgnoreCase(nome)) {
                presente = true;
                break; // Saia do loop assim que encontrar o nome
            }
        }
        if (presente) {
            System.out.println("O nome: " + nome + " está presente na lista!");
        } else {
            System.out.println("O nome: " + nome + " não está presente na lista!");
        }
    }

    public void exibirLista() {
        System.out.println(stringList);
    }

    public void removerTerceiroNome() {
        if (stringList.size() > 2) { // Verifique se há pelo menos 3 elementos na lista
            stringList.remove(2);
        } else {
            System.out.println("A lista não tem um terceiro elemento para remover.");
        }
    }

    public void ordenarLista(){
        Collections.sort(stringList);
    }

    public static void main(String[] args) {
        ManipulacaoArrayList listaNome = new ManipulacaoArrayList();

        listaNome.adicionarPalavra("Laura");
        listaNome.adicionarPalavra("Sofia");
        listaNome.adicionarPalavra("Maria");
        listaNome.adicionarPalavra("Mario");

        listaNome.ordenarLista();
        listaNome.exibirLista();

        listaNome.removerTerceiroNome();
        listaNome.exibirLista();

        listaNome.verificarSeEstaPresente("Laura");
        listaNome.removerTerceiroNome(); // Não terá efeito já que a lista tem menos de 3 elementos agora
        listaNome.exibirLista();
        listaNome.removerTerceiroNome(); // Não terá efeito já que a lista tem menos de 3 elementos agora

    }
}
