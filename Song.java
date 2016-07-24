package MusicFestival;

/**
 * Created by Magi on 24.7.2016 г..
 */
public class Song {
    public static final String NO_TEXT = "the song is instrumental";

    private String title;
    private StringBuilder text;

    public Song(String title, StringBuilder text) {
        this.setTitle(title);
        this.setText(text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().length() == 0) {
            throw new IllegalArgumentException("The name of the song is missing.");
        }
        this.title = title;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        if (text.equals(null) || text.length() == 0) {
            throw new IllegalArgumentException("Song need a text even chalga style :D.");

        }
        this.text = text;
    }

    @Override
    public String toString() {
        return "The song: " + this.getTitle() + "\n" + this.getText();
    }
}
