package hust.soict.globalict.garbage;

public class NoGarbage {
	public void cleanUpGarbage() {
		System.gc();
		System.runFinalization();
		System.out.println("Cleaned garbage.");
	}
}
