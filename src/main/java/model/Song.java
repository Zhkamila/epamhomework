package model;

import model.artist.Composer;
import model.artist.Performer;
import model.artist.Songwriter;
import model.enums.Genre;

public class Song {
    private String title;
    private Performer performer;
    private Songwriter songwriter;
    private Composer composer;
    private int length;
    private Genre genre;

    public Song(String title, Performer performer, Songwriter songwriter, Composer composer, int length, Genre genre) {
        this.title = title;
        this.performer = performer;
        this.songwriter = songwriter;
        this.composer = composer;
        this.length = length;
        this.genre = genre;
    }

    public Song(String title, int length, Genre genre) {
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    public Song(String title, Performer performer) {
        this.title = title;
        this.performer = performer;
    }

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public Songwriter getSongwriter() {
        return songwriter;
    }

    public void setSongwriter(Songwriter songwriter) {
        this.songwriter = songwriter;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\n'" + title + "' " + genre.getGenreName() + " song " + length + " minutes";
    }
}
