package MusicFestival;

import java.util.ArrayList;

/**
 * Created by Magi on 24.7.2016 г..
 */
public abstract class Musician implements IGoodBad {
    private String name;

    public Musician(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    protected void setName(String name) {

        this.name = name;
    }

}
