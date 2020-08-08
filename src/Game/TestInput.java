package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class TestInput {

	/*
	 * public static void finder() throws IOException {
	 * 
	 * File file = new File("/home/riky/eclipse-workspace/Banking_System");
	 * 
	 * File[] files = file.listFiles(new FilenameFilter() {
	 * 
	 * 
	 * @Override public boolean accept(File dir, String name) { if
	 * (name.toLowerCase().endsWith(".txt")) { return true; } else { return false; }
	 * } }); for (File f : files) { System.out.println(f.getName()); }
	 * 
	 * }
	 */

	public static void inputEntryCheck() throws IOException {

		// File merging
		PrintWriter pw = new PrintWriter("mergedFile.txt");

		// BufferedReader object for file1.txt

		BufferedReader br1 = new BufferedReader(new FileReader("SLNumber1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("SLNumber2.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("SLNumber3.txt"));
		BufferedReader br4 = new BufferedReader(new FileReader("SLNumber4.txt"));
		BufferedReader br5 = new BufferedReader(new FileReader("SLNumber5.txt"));
		BufferedReader br6 = new BufferedReader(new FileReader("SLNumber6.txt"));

		BufferedReader br1jb = new BufferedReader(new FileReader("JBNumber1.txt"));
		BufferedReader br2jb = new BufferedReader(new FileReader("JBNumber2.txt"));
		BufferedReader br3jb = new BufferedReader(new FileReader("JBNumber3.txt"));
		BufferedReader br4jb = new BufferedReader(new FileReader("JBNumber4.txt"));
		BufferedReader br5jb = new BufferedReader(new FileReader("JBNumber5.txt"));

		BufferedReader js1 = new BufferedReader(new FileReader("JSNumber1.txt"));
		BufferedReader js2 = new BufferedReader(new FileReader("JSNumber2.txt"));

		String line1 = br1.readLine();
		String line2 = br2.readLine();
		String line3 = br3.readLine();
		String line4 = br4.readLine();
		String line5 = br5.readLine();
		String line6 = br6.readLine();

		String line7 = br1jb.readLine();
		String line8 = br2jb.readLine();
		String line9 = br3jb.readLine();
		String line10 = br4jb.readLine();
		String line11 = br5jb.readLine();

		String line12 = js1.readLine();
		String line13 = js2.readLine();

		// loop to copy lines of
		// file1.txt and file2.txt
		// to file3.txt alternatively
		while (line1 != null || line2 != null || line3 != null || line4 != null || line5 != null || line6 != null

				|| line7 != null || line8 != null || line9 != null || line10 != null || line11 != null || line12 != null
				|| line13 != null

		) {
			if (line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}

			if (line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}

			if (line3 != null) {
				pw.println(line3);
				line3 = br3.readLine();
			}
			if (line4 != null) {
				pw.println(line4);
				line4 = br4.readLine();
			}
			if (line5 != null) {
				pw.println(line5);
				line5 = br5.readLine();
			}
			if (line6 != null) {
				pw.println(line6);
				line6 = br6.readLine();
			}

			if (line7 != null) {
				pw.println(line7);
				line7 = br1jb.readLine();
			}
			if (line8 != null) {
				pw.println(line8);
				line8 = br2jb.readLine();
			}
			if (line9 != null) {
				pw.println(line9);
				line9 = br3jb.readLine();
			}
			if (line10 != null) {
				pw.println(line10);
				line10 = br4jb.readLine();
			}
			if (line11 != null) {
				pw.println(line11);
				line11 = br5jb.readLine();
			}

			if (line12 != null) {
				pw.println(line12);
				line12 = js1.readLine();
			}

			if (line13 != null) {
				pw.println(line13);
				line13 = js2.readLine();
			}
		}

		pw.flush();

		// closing resources
		br1.close();
		br2.close();
		br3.close();
		br4.close();
		br5.close();
		br6.close();

		br1jb.close();
		br2jb.close();
		br3jb.close();
		br4jb.close();
		br5jb.close();

		js1.close();
		js2.close();

		pw.close();

		System.out.println("Merged file1.txt and file2.txt alternatively into file3.txt");

		//

		try (BufferedReader reader1 = new BufferedReader(new FileReader("final.txt"));

				BufferedReader readerf = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			// assuming file1.txt is smaller than file2.txt in terms of no. of lines

			HashSet<String> file1 = new HashSet<String>();

			String s1 = null;

			while (((s1 = reader1.readLine()) != null)) {
				file1.add(s1);
			}

			while (((s1 = readerf.readLine()) != null)) {
				if (file1.contains(s1)) {

					System.out.println("The number is already used last time, starting game again " + "\n" + s1);
					new StandardLottery().regularLottery();

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws IOException {

		// createDirectory();
		// inputEntryCheck();

	}

}
