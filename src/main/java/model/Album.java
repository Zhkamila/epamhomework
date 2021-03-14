package model;

import java.util.List;

public class Album {
    private String title;
    private List<Song> songs;
    private int releaseYear;


    public Album(String title, List<Song> songs, int releaseYear) {
        this.title = title;
        this.songs = songs;
        this.releaseYear = releaseYear;
    }

    public Album(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public int getLength() {
        int length = 0;
        for (Song song : songs) {
            length += song.getLength();
        }
        return length;
    }

    public void sortByGenre() {
        songs.sort((songA, songB) -> songA.getGenre().getGenreName().compareTo(songB.getGenre().getGenreName()));
    }

    public Song getSongByLengthRange(int minLength, int maxLength) {
        Song unknown = new Song("Unknown", 0, null);
        for (Song song : songs) {
            if (song.getLength() <= maxLength && song.getLength() >= minLength) {
                return song;
            }
        }
        return unknown;
    }

    @Override
    public String toString() {
        return "Album title: " + title + "\nYear of release: " + releaseYear + "\nSongs: " + songs ;
    }
}
