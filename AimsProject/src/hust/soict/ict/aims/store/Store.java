package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> wareHouse = new ArrayList<Media>(100);

    public void addDVD(Media media) {
        this.wareHouse.add(media);
        System.out.println("Added: "+media.getTitle());
    }

    public void removeDVD(Media media) {
        if (this.wareHouse.remove(media)) {
            System.out.println(media.getTitle()+"'s removed.");
        } else {
            System.out.println(media.getTitle()+" hasn't in the store yet!");
        }
    }

    public void print() {
        System.out.print("[");
        int lastIndex = this.wareHouse.size() - 1;
        for (int i = 0; i <= lastIndex; i++) {
            System.out.print(this.wareHouse.get(i).getTitle() + (i == lastIndex ? "" : ", "));
        }
        System.out.println("]");
    }
}