package MusicFestival;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class InstrumentsMusician extends Musician {
    public static final String MANY_INSTRUMEMTSMUSICIAN = "more than one playing";

    public InstrumentsMusician(String name) {
        super(name);
    }

    @Override
    protected void setName(String name) {
        super.setName(MANY_INSTRUMEMTSMUSICIAN);
    }

    @Override
    public boolean presentation(String choice) {
        return (choice == "good") ? true : false;

    }
}
