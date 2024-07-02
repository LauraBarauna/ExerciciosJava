package com.exerciciosjava.poo.desafios.sistemalivraria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Library {
    //atributo
    private List<Book> bookList;

    //construtor
    public Library() {
        this.bookList = new ArrayList<>();
    }

    //métodos
    public void addBook(Book book){
        bookList.add(book);
    }

    public List findBookByTitle(String title){
        ArrayList bookTitle = new ArrayList<>(bookList);
        if (!bookList.isEmpty()){
            for (Book b: bookList){
                if (b.getTitle().equalsIgnoreCase(title)){
                    bookTitle.add(b);
                }
            }
        }
        return bookTitle;
    }

    public void listAllBooks(){
        System.out.println(bookList);
    }

}
