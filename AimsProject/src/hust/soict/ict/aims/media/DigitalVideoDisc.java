package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, cost);
        setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(director, category, title, cost);
        setLength(length);
    }
    public String toString(){
        return this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+": "+this.getCost()+" $";
    }
    public boolean isMatch(String title) {
        if (this.getTitle().toLowerCase().contains(title.toLowerCase())) {
            return true;
        }
        return false;
	}

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
