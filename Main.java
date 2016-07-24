package MusicFestival;

import java.util.ArrayList;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {

        //create songs
        Song linkinParkText = new Song("Burn It Down", new StringBuilder("We're building it up\n" +
                "To break it back down\n" +
                "We're building it up\n" +
                "To burn it down\n" +
                "We can't wait\n" +
                "To burn it to the ground\n" +
                "\n" +
                "Read more: Linkin Park - Burn It Down Lyrics | MetroLyrics\n"));

        Song madonnaText = new Song("Vogue", new StringBuilder("All you need is your own imagination\n" +
                "So use it that's what it's for (that's what it's for)\n" +
                "Go inside, for your finest inspiration"));


        Song klangkarussellSong = new Song("Sonnentanz", new StringBuilder(Song.NO_TEXT));

        //create musician
        Vocalist madonna = new Vocalist("Madonna");
        Musician klang = new InstrumentsMusician(InstrumentsMusician.MANY_INSTRUMEMTSMUSICIAN);
        ArrayList<Musician> arList = new ArrayList<>();
        arList.add(klang);
        arList.add(madonna);

        //create groups
        Group group = new Group("LinkinPark");
        Group klangkarussell = new Group("Klangkarussell", arList, new Song[]{klangkarussellSong});
    }
}
