package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    @Test
    public void testValiableMovies() {
        List<Movie> movies = BibliotecaApp.getAllMovies();
        assertEquals(getTestMovies(), movies);
    }

    List<Movie> getTestMovies(){
        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("A","1956","X",2);
        Movie movie2 = new Movie("B","1957","Y",5);
        Movie movie3 = new Movie("C","1958","Z",1);
        Collections.addAll(movies, movie1, movie2,movie3);
        return movies;
    }
}
