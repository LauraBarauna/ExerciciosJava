package com.exerciciosjava.poo.desafios.sistemalivraria;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        // Adicionando livros à biblioteca
        library.addBook(1, "Clean Code", "Robert C. Martin", 2008);
        library.addBook(2, "Effective Java", "Joshua Bloch", 2001);
        library.addBook(3, "The Pragmatic Programmer", "Andrew Hunt", 1999);

        // Buscando um livro pelo título
        library.findBookByTitle("Effective Java");

        // Tentando buscar um livro que não existe
        library.findBookByTitle("Java Concurrency in Practice");

        // Listando todos os livros
        System.out.println("\nTodos os livros na biblioteca:");
        library.listAllBooks();
    }
}
