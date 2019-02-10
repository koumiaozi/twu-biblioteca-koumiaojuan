package com.twu.biblioteca;

public class Movie {
    private String name;
    private String year;
    private String director;
    private int movieRating;

    public Movie(String name, String year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Movie object = (Movie)obj;
        return name.equals(object.name) && year.equals(object.year)
                && director.equals(object.director) && movieRating == object.movieRating;
    }
}
