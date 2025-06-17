package com.example.mycollections.models;

public class Movie extends LibraryItem {
    private String director;
    private int runtime;

    public Movie(String name, int year, String director, int runtime) {
        super(name, year);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public int getRuntime() {
        return runtime;
    }


}
