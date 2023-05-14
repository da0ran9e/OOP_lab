package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class BinaryTextReader {

	public static void main(String[] args) {
		String filename = "src/hust/soict/globalict/garbage/test1Mb.json";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
			return;
		}

		/* // > 1 minute for 500KB
		startTime = System.currentTimeMillis();
		String outputStr = "";
		for (byte b : inputBytes) {
			outputStr += (char)b;
		}
		*/

		startTime = System.currentTimeMillis();
		StringBuilder outputStrBuilder = new StringBuilder();
		for (byte b : inputBytes) {
			outputStrBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time using StringBuilder: " + (endTime - startTime) + "ms for "+inputBytes.length+ " bytes.");

	}

}