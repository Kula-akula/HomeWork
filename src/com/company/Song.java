package com.company;

public class Song {
   private String name;
   private String artist;
   private String genre;
   private String text;

    Song() {
    }

    public Song(String name, String artist, String genre, String text) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.text = text;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song " +
                "name: " + name +
                "; \nArtist: " + artist +
                "; \nGenre: " + genre +
                "; \nText: \n" + text ;
    }
}
