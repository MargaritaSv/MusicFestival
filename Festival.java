package MusicFestival;

import javax.smartcardio.ATR;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Festival {
    private String name;
    private String place;
    private String time;
    private Group[] groups;


    public Festival(String name, String place, String time, Group[] groups) {
        this.setName(name);
        this.setPlace(place);
        this.setTime(time);
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() <= 1) {
            throw new IllegalArgumentException("The festival name must be at least two letters.");
        }
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place == null || place.trim().length() <= 1) {
            throw new IllegalArgumentException("The place name must be at least two letters.");
        }
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if (place == null || place.trim().length() <= 1) {
            throw new IllegalArgumentException("The festival cannot exist without time.");
        }
        this.time = time;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        if (groups.equals(null)) {
            throw new IllegalArgumentException("Festival doesn't exist without groups");
        }
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Festival: " + this.getName() + "\n" + "The place is " + this.getPlace() + " and the time is " + this.getTime()
                + "Invited groups are: " + this.getGroups();
    }
}
