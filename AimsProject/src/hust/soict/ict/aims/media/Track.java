package hust.soict.ict.aims.media;

public class Track {
    private String title;
    private int length;
    public Track(String title) {
        super();
        this.title = title;
    }
    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
