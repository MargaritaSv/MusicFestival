package MusicFestival;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Vocalist extends Musician {
    @Override
    public boolean presentation(String choice) {
        return (choice == "good") ? true : false;
    }
}
