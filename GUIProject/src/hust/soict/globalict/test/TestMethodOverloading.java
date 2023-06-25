package hust.soict.globalict.test;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);

		anOrder.addMedia(dvd1, dvd2, dvd3);
		anOrder.addMedia(dvd2, dvd3);
		anOrder.addMedia();

		System.out.println(anOrder.getContentAllMedia());
		System.out.println("Total Cost: " + anOrder.totalCost());
	}

}
