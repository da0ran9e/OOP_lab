package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import java.util.Scanner;
public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        
        int input;
        Scanner scanner = new Scanner(System.in);
        do{
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStoreOptions();
                    break;
                case 3:
                    cartMenu();
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3");
                    break;
            }

        }while (input!=0);

    }
    public static void updateStoreOptions() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a new DVD");
        System.out.println("2. Add a new CD");
        System.out.println("3. Add a new Book");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    addDVD();
                    break;
                case 2:
                    addCD();
                    break;
                case 3:
                    addBook();
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3");
                    break;
            }
        } while (input != 0);
    }
    public static void addDVD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter director: ");
        String director = scanner.nextLine();
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter cost: ");
        float cost = scanner.nextFloat();
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        System.out.println("DVD added successfully!");
    }
    public static void addCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter artist: ");
        String artist = scanner.nextLine();
        System.out.println("Enter cost: ");
        float cost = scanner.nextFloat();
        DigitalVideoDisc cd = new DigitalVideoDisc(title, category, artist, cost);
        System.out.println("CD added successfully!");
    }
    public static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter cost: ");
        float cost = scanner.nextFloat();
        DigitalVideoDisc book = new DigitalVideoDisc(title, category, author, cost);
        System.out.println("Book added successfully!");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

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
