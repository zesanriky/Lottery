package Game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Country {

	public static void main(String[] args) throws IOException {

		String file = "check.txt";

		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter(file, true);
		while (true) {
			String input = scan.nextLine();

			if ("DONE".equalsIgnoreCase(input.trim())) {
				break;
			}
			fw.write("\n" + input + "\n");

		}

		scan.close();
		fw.close();

		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Enter filename >> ");
		String response = Keyboard.nextLine();
		File file1 = new File(response);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file1));
			System.out.print("Enter job ID >> ");
			String num = scan.nextLine();
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitData = line.split("\\^");
				for (String data : splitData) {
					if (data.equalsIgnoreCase(num)) {

						System.out.println("Found" + line);
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
