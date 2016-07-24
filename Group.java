package MusicFestival;

import java.util.ArrayList;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Group {
    private String name;
    private ArrayList<Song> songs;
    private ArrayList<Musician> musicians;

    public Group(String name, ArrayList<Song> songs, ArrayList<Musician> musicians) {
        this.setName(name);
        this.songs = new ArrayList<>();
        this.musicians = new ArrayList<>();
    }

    //if one is created the name we can't changed
    private void setName(String name) {
        if (name == null || name.trim().length() <= 1) {
            throw new IllegalArgumentException("The group name must be at least two letters.");
        }
        this.name = name;
    }

}