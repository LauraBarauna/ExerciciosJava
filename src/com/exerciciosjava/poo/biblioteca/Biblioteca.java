package com.exerciciosjava.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<String> livros;

    //construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    //Metódos
    public void adicionarLivro (String livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro (String livro){
        List<String> livrosParaRemover = new ArrayList<>();
        for (String l : livros){
            if (l.equalsIgnoreCase(livro)){
                livrosParaRemover.add(l);
            }
        }
        livros.removeAll(livrosParaRemover);
        System.out.println("Livro removido: "+livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na pooCollections.biblioteca.");
        } else {
            System.out.println("Livros na pooCollections.biblioteca:");
            for (String livro : livros) {
                System.out.println("- " + livro);
            }
        }
    }
}


