package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        List<Book> books = getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static String getWelcomeMessage() {
        return "Welcome to Biblioteca.Your one-stop-shop for great book titles in Bangalore!";
    }

    static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "Alice", "1991");
        Book book2 = new Book(2, "Bob", "1992");
        books.add(book1);
        books.add(book2);
        return books;
    }
}
