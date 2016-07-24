package MusicFestival;

import java.util.ArrayList;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Group {
    private ArrayList<Song> songs;
    private ArrayList<Musician> musicians;

    public Group(ArrayList<Song> songs, ArrayList<Musician> musicians) {
        this.songs = new ArrayList<>();
        this.musicians = new ArrayList<>();
    }


}
