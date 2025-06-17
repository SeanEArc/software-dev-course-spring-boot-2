package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String artist;
    private int tracks;

    public Album(String name, int year, String artist, int tracks) {
        super(name, year);
        this.artist = artist;
        this.tracks = tracks;
    }

    // Getters
    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }


}
