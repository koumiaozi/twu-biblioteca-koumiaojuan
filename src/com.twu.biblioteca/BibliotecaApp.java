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

    public static List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("A","1956","X",2);
        Movie movie2 = new Movie("B","1957","Y",5);
        Movie movie3 = new Movie("C","1958","Z",1);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        return movies;
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
        for (Book book : books) {
            System.out.println(getBookInformation(book));
        }
    }

    public static String getBookInformation(Book book) {
        return "Author:" + book.getAuthor() + ", publication year: " + book.getPublicationYear();
    }

    public static Book checkOutBook(String author){
        List<Book> books = getAllBooks();
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                return book;
            }
        }
        return null;
    }

}
