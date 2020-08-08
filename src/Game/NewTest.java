package Game;

import java.io.FileWriter;
import java.io.IOException;

public class NewTest {

	public static void main(String[] args) throws IOException {

		int number1 = 1;
		FileWriter fileWriteLotto1 = new FileWriter("append.txt", true);
		fileWriteLotto1.write("\n" + number1);
		fileWriteLotto1.close();

	}
}
