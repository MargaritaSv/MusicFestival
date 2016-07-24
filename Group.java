package MusicFestival;

import java.util.ArrayList;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Group {
    private String name;
    private Song[] songs;
    private ArrayList<Musician> musicians;

    public Group(String name, ArrayList<Musician> musicians, Song[] songs) {
        this.setName(name);
        this.setMusicians(musicians);
        this.setSongs(songs);
    }

    public Group(String name) {
        this.setName(name);
        this.setSongs(new Song[10]);
        this.musicians = new ArrayList<>();
    }


    //if one is created the name we can't changed

    public String getName() {
        return name;
    }

    public Song[] getSongs() {
        return songs;
    }

    public ArrayList<Musician> getMusicians() {
        return musicians;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() <= 1) {
            throw new IllegalArgumentException("The group name must be at least two letters.");
        }
        this.name = name;
    }

    public void setSongs(Song... songs) {
        this.songs = songs;
    }

    public void setMusicians(ArrayList<Musician> musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return this.getName() + ":" + "\n  -> " + this.getMusicians() + " - " + this.getSongs() + "\n";
    }
}