package com.exerciciosjava.poo.desafios.sistemalivraria;

import java.util.ArrayList;
import java.util.List;


public class Library {
    //atributo
    private List<Book> bookList;

    //construtor
    public Library() {
        this.bookList = new ArrayList<>();
    }

    //metódos
    public void addBook(int id, String title, String author, int year){
        Book books = new Book(id, title, author, year);
        bookList.add(books);
    }

    public void findBookByTitle(String title){
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Livro encontrado: " + b);
                    return;  // Sai do método após encontrar o livro
                }
            }
            System.out.println("Livro não encontrado.");
        } else {
            System.out.println("A biblioteca está vazia.");
        }
    }

    public void listAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }

    }
}




