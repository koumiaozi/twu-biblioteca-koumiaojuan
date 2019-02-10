package com.twu.biblioteca;

public class Book {
    private int id;
    private String author;
    private String publicationYear;

    public Book(int id, String author, String publicationYear) {
        this.id = id;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Book object = (Book)obj;
        return id == object.id && author.equals(object.author) && publicationYear.equals(object.publicationYear);
    }
}
