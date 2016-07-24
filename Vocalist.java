package MusicFestival;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Vocalist extends Musician {


    public Vocalist(String name) {
        super(name);
    }

    @Override
    protected void setName(String name) {
        if (name == null || name.trim().length() <= 1) {
            throw new IllegalArgumentException("The group name must be at least two letters.");
        }
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.getName();
    }

    @Override
    public boolean presentation(String choice) {
        return (choice == "good") ? true : false;
    }
}
