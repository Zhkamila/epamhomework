import model.Album;
import model.artist.Performer;
import model.Song;
import model.enums.AlbumType;
import model.enums.Genre;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Performer performer = new Performer("Marshall", "Mathers", 1972, "Missouri");
        performer.setStageName("Eminem");
        Song song = new Song("Lose yourself", performer);
        song.setGenre(Genre.HIPHOP);
        song.setLength(5);
        List<Song> songs = new ArrayList<>();
        songs.add(song);
        Album album = new Album("Lose Yourself", songs, 2002, AlbumType.SINGLE);
        System.out.println(album.toString());
    }
}
