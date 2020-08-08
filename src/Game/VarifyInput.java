
package Game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VarifyInput {

	private static int counter = 1;

	public static void calculateAll() throws IOException {

		int choiceEntry;
		Scanner scanChoice = new Scanner(System.in);

		do {
			System.out.println("Enter: " + "\n" + "1 for viewing the unlucky numers you have already used" + "\n"
					+ "2 for deleting ulucky numbers" + "\n" + "\n" + "3 for restarting the game" + "\n"
					+ "0 for exiting the Game");

			while (!scanChoice.hasNextInt()) {
				System.out.println("Input is not a number.");
				scanChoice.nextLine();
			}

			choiceEntry = scanChoice.nextInt();

			switch (choiceEntry) {
			case 1:
				viewFile();
				break;
			case 2:
				deleteNumbers();
				break;
			case 3:
				new StandardLottery().regularLottery();
				break;
			case 0:
				System.err.println("Good Bye");
				System.exit(0);
			default:
				System.out.println("Choice must be a value between 1 and 3.");
			}
		} while (choiceEntry != 0);

	}

	public static void myPrintln(int counter2) {
		counter++;
		System.out.println("\n" + "You have entered your" + "" + " " + counter2 + "" + " number");
	}

	static StandardLottery see = new StandardLottery();

	public static void deleteNumbers() throws IOException {

		File inputFile = new File("unluckyNumber.txt");
		File tempFile = new File("myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to delete");
		String str = sc.nextLine();
		System.out.print("You have entered: " + str + "\n");

		String currentLine;

		while ((currentLine = reader.readLine()) != null) {

			String trimmedLine = currentLine.trim();
			if (trimmedLine.equals(str))
				continue;
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		boolean successful = tempFile.renameTo(inputFile);
	}

	public static void viewFile() throws IOException {

		String file = "unluckyNumber.txt";

		BufferedReader in = new BufferedReader(new FileReader(file));

		String line;
		System.out.println("\n" + "These are the following unlucky numbers" + "\n"
				+ "you have tried out while playing regular Lottery and Jackpots");

		while ((line = in.readLine()) != null) {
			System.out.println("\n" + line);

		}
		in.close();

	}

	public static void main(String[] args) throws IOException {

		calculateAll();

	}

}
