package MusicFestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //create songs
        Song linkinParkText = new Song("Burn It Down", new StringBuilder("We're building it up\n" +
                "To break it back down\n" +
                "We're building it up\n" +
                "To burn it down\n" +
                "We can't wait\n" +
                "To burn it to the ground\n" +
                "\n" +
                "Read more: Linkin Park - Burn It Down Lyrics | MetroLyrics\n"));

        Song linkinParkNumb = new Song("Numb", new StringBuilder(" numb text"));
        Song madonnaText = new Song("Vogue", new StringBuilder("All you need is your own imagination\n" +
                "So use it that's what it's for (that's what it's for)\n" +
                "Go inside, for your finest inspiration"));


        Song klangkarussellSong = new Song("Sonnentanz", new StringBuilder(Song.NO_TEXT));

        //create musician
        Vocalist madonna = new Vocalist("Madonna");
        Musician klang = new InstrumentsMusician(InstrumentsMusician.MANY_INSTRUMEMTSMUSICIAN);
        InstrumentsMusician linkInstr = new InstrumentsMusician(InstrumentsMusician.MANY_INSTRUMEMTSMUSICIAN);

        ArrayList<Musician> arList = new ArrayList<>();
        arList.add(klang);
        arList.add(madonna);

        ArrayList<Musician> listInstrumntsMusian = new ArrayList<>();
        listInstrumntsMusian.add(linkInstr);

        //create groups
        Group group = new Group("LinkinPark");
        group.setSongs(linkinParkText, linkinParkNumb);
        group.setMusicians(listInstrumntsMusian);

        Group klangkarussell = new Group("Klangkarussell", arList, new Song[]{klangkarussellSong});

        Festival festival = new Festival("Dance", "Sofiq", "12.08.2016", new Group[]{group, klangkarussell});

        System.out.println("Write the time on the scene for the group:\n     in format \"(start)hh-mm - (end)hh-mm \" : \n");
        String result = infoFestival(festival);

        System.out.println(festival);
        System.out.println(result);

    }

    private static String infoFestival(Festival festival) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String input;

        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < festival.getGroups().length; i++) {
            System.out.print("The group: " + festival.getGroups()[i].getName());
            input = bR.readLine();
            sB.append(festival.getGroups()[i].getName()).append(" -> ").append(input).append(System.lineSeparator());

        }
        return sB.toString();
    }
}
/*
12:34 - 12:45
12:56 -13:00
 */