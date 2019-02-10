package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        List<Book> books = getAllBooks();
        printBookInformation(books);
    }

    static String getWelcomeMessage() {
        return "Welcome to Biblioteca.Your one-stop-shop for great book titles in Bangalore!";
    }

    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "Alice", "1991");
        Book book2 = new Book(2, "Bob", "1992");
        books.add(book1);
        books.add(book2);
        return books;
    }

    public static void printBookInformation(List<Book> books) {
        System.out.print(getBookInformation(books));
    }

    public static String getBookInformation(List<Book> allBooks) {
        String result = "";
        for (Book book : allBooks) {
           result += "Author:" + book.getAuthor() + ", publication year: " + book.getPublicationYear()+"\n";
        }
        return result;
    }
}
