package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void testHaveWelcomeMessageWhenStartApplication() {
        String message = BibliotecaApp.getWelcomeMessage();
        assertEquals("Welcome to Biblioteca.Your one-stop-shop for great book titles in Bangalore!", message);
    }

    @Test
    public void testViewAListOfAllBooksWhenMessageAppears() {
        List<Book> bookList = getTestData();
        List<Book> books = BibliotecaApp.getAllBooks();
        assertEquals(bookList, books);
    }

    @Test
    public void testViewAuthorAndPublicationYearOnAllBooks() {
        BibliotecaApp.printBookInformation(BibliotecaApp.getAllBooks());
        assertEquals("Author:Alice, publication year: 1991\n" +
                "Author:Bob, publication year: 1992\n",systemOut());
    }

    private List<Book> getTestData() {
        Book book1 = new Book(1, "Alice", "1991");
        Book book2 = new Book(2, "Bob", "1992");
        List<Book> bookList = new ArrayList<>();
        Collections.addAll(bookList, book1, book2);
        return bookList;
    }
}
