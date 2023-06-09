package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger Allers",87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" , "Science Fiction" , "George Lucas",87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation", 18.995f);
        anOrder.addMedia(dvd3);

        anOrder.removeMedia(dvd1);

        System.out.println("Total Cost is:");
        System.out.println(anOrder.totalCost());
    }
}
