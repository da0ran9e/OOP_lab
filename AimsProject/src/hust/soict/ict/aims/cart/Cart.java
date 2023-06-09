package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.Media;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrder = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

    private int qtyOrdered = itemsOrder.size();
    private float totalCost = 0f;
    public int getQtyOrdered() {
        return itemsOrder.size();
    }
    DecimalFormat df = new DecimalFormat("###.###");
    public boolean full() {
        if (itemsOrder.size() == MAX_NUMBERS_ORDERED) {
            return true;
        } else {
            return false;
        }
    }

    public void addMedia(Media media) {
        if (full()) {
            System.out.println("The Cart is almost full");
        }
        else {
            itemsOrder.add(media);
            System.out.println("The disc has been added");
        }
    }
    public void addMedia(Media... mediaList){
        for(Media media:mediaList){
            if (full()) {
                System.out.println("The Cart is almost full");
                break;
            }
            else {
                itemsOrder.add(media);
                System.out.println("The disc has been added");
            }
        }
    }

    public void removeMedia(Media disc) {
        if(itemsOrder.size() == 0){
            System.out.println("There is no item in cart!");
        }
        else {
            itemsOrder.remove(disc);
            System.out.println("The media has been removed!");
        }
    }

    public String totalCost() {
        for (int i = 0; i < this.itemsOrder.size(); i++) {
            if(!this.itemsOrder.isEmpty()) {
                totalCost += itemsOrder.get(i).getCost();
            }
        }
        return df.format(totalCost);
    }
    public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");

		Media media;
        for (int i = 0; i < this.itemsOrder.size(); i++) {
        	media = this.itemsOrder.get(i);
        	System.out.printf("%d. %s\n", i+1, media.toString());
        }

		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
    public void searchByID(int id) {
		System.out.println("Search for: " + id);

		Media media;
        for (int i = 0; i < this.itemsOrder.size(); i++) {
        	media = this.itemsOrder.get(i);
        	if (media.getId() == id) {
        		System.out.println("Found "+ i +"matched: "+ media.toString());
        		return;
        	}
        }
        System.out.println("Not found!");
	}

	public void searchByTitle(String keywords) {
		System.out.println("- Search for: \"" + keywords + "\"");

		int matcher = 0;
		Media media;
        for (int i = 0; i < this.itemsOrder.size(); i++) {
        	media = this.itemsOrder.get(i);
        	if (media.isMatch(keywords)) {
        		System.out.println("Found "+ i +"matched: "+ media.toString());
        		matcher += 1;
        	}
        }
        if (matcher == 0) {
        	System.out.println("Not found!");
        }
	}
}

