package MusicFestival;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class InstrumentsMusician extends Musician {

    @Override
    public boolean presentation(String choice) {
        return (choice == "good") ? true : false;

    }
}
