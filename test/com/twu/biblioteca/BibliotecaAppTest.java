package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testHaveWelcomeMessageWhenStartApplication() {
        String message = BibliotecaApp.getWelcomeMessage();
        assertEquals("Welcome to Biblioteca.Your one-stop-shop for great book titles in Bangalore!", message);
    }

    @Test
    public void testViewAListOfAllBooksWhenMessageAppears() {
        Book book1 = new Book(1, "Alice", "1991");
        Book book2 = new Book(2, "Bob", "1992");
        List<Book> bookList = new ArrayList<>();
        Collections.addAll(bookList, book1, book2);
        List<Book> books = BibliotecaApp.getAllBooks();
        assertEquals(bookList, books);
    }
}
