package hust.soict.globalict.garbage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GarbageCreator {
	public void createGarbage() {
		for (int i = 0; i < 1000000; i++) {
			Object garbage = new Object();
			// this.garbageList.add(garbage);
			System.out.print(i);
		}
		
		System.out.println("1 mil garbage has been created");
	}
	
	public static void main(String[] args) {
		GarbageCreator truck = new GarbageCreator();
		truck.createGarbage();
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		NoGarbage cleaner = new NoGarbage();

		while(true) {
			System.out.println("\"Clean\" to clean garbage. \"X\" to exit");
			System.out.print("Enter your name? ");
			name = scanner.nextLine();

			if (name.equals("Clean")) {
				truck = null;
				cleaner.cleanUpGarbage();
			} else if (name.equals("X")) {
				break;
			}
		}
		
		scanner.close();
	}
}
