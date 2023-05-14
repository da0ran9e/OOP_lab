package hust.soict.globalict.garbage;

public class NoGarbage {
	public void cleanUpGarbage() {
		System.gc();
		System.out.println("Cleaned!");
	}
}
