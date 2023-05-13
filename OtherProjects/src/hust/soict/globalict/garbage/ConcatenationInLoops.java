package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		int maxloop = 65536;
		
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < maxloop; i++)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxloop; i++)
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
