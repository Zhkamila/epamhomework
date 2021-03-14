import model.Album;
import model.Song;
import model.artist.Composer;
import model.artist.Performer;
import model.artist.Songwriter;
import model.enums.Genre;
import model.enums.VoiceType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Composer bence = new Composer("Peter", "Bence", 1991, "Hungary");
        bence.setInstrument("Piano");
        Composer guetta = new Composer("David", "Guetta", 1967, "France");
        guetta.setInstrument("DJ");
        Songwriter pergolizzi = new Songwriter("Laura", "Pergolizzi", 1981, "Long Island", "Warner Bros.", Genre.INDIEROCK);
        Songwriter swift = new Songwriter("Taylor", "Swift", 1989, "Pennsylvania", "Big Machine", Genre.POP);
        Performer feuerstein = new Performer("Peter", "Bence", 1991, "Gladwin", "Capitol", "NF", VoiceType.BASS);
        Performer scrip = new Performer("Adil", "Zhalelov", 1990, "Pavlodar", "Musica 36", "Scriptonit", VoiceType.BASS);

        Song change = new Song("Change", feuerstein, pergolizzi, guetta, 4, Genre.HIPHOP);
        Song shake = new Song("Shake it off", scrip, swift, bence, 2, Genre.POP);
        Song cosmos = new Song("Cosmos", scrip, pergolizzi, bence, 4, Genre.HIPHOP);
        Song dynamite = new Song("Dynamite", scrip, swift, guetta, 6, Genre.KPOP);
        Song awesome = new Song("Awesome piano", 3, Genre.CLASSICAL);
        awesome.setComposer(bence);
        Song end = new Song("In the end", feuerstein);
        end.setLength(5);
        end.setGenre(Genre.ROCK);
        end.setComposer(guetta);
        end.setSongwriter(pergolizzi);
        Song shallow = new Song("Star is born", 2, Genre.CLASSICAL);
        shallow.setComposer(bence);

        List<Song> songs = new ArrayList<>(Arrays.asList(change, shake, cosmos, dynamite));
        songs.addAll(Arrays.asList(awesome, end));

        Album disk = new Album("Cool", songs, 2021);
        disk.addSong(shallow);

        System.out.println("\n\tNew disk of cool songs:");
        System.out.println(disk);
        System.out.println("\nThe length of the disk is: " + disk.getLength() + " minutes");
        disk.sortByGenre();
        System.out.println("\n\tAlbum songs sorted by genre:");
        System.out.println(disk.getSongs());
        System.out.println("\n\tSong in a range 3 - 4 minutes: " + disk.getSongByLengthRange(3, 4));
        System.out.println("\n\tSong in a range 1 - 2 minutes: " + disk.getSongByLengthRange(1, 2));
        System.out.println("\n\tsong in a range 5 - 6 minutes: " + disk.getSongByLengthRange(5, 6));
    }
}
