package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MatchInput {

	public static void createDirectory() throws IOException {

		String fileName = "/home/riky/eclipse-workspace/Banking_System/Files";

		Path path = Paths.get(fileName);

		if (!Files.exists(path)) {

			Files.createDirectory(path);

			System.out.println("\n Directory created");
		} else {

			System.out.println("\n Directory already exists");
		}
	}

	private static final String FOLDER_PATH = ("/home/riky/eclipse-workspace/Banking_System/Files");

	public static void collectFiles() throws IOException {

		Path folderPath = Paths.get(FOLDER_PATH);

		// prepare a data structure for a file's name and content
		Map<String, List<String>> linesOfFiles = new TreeMap<String, List<String>>();

		// retrieve a list of the files in the folder
		List<String> fileNames = new ArrayList<>();
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath)) {
			for (Path path : directoryStream) {
				fileNames.add(path.toString());
			}
		} catch (IOException ex) {
			System.err.println("Error reading files");
			ex.printStackTrace();
		}

		// go through the list of files
		for (String file : fileNames) {
			try {
				// put the file's name and its content into the data structure
				List<String> lines = Files.readAllLines(folderPath.resolve(file));
				linesOfFiles.put(file, lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// finally, print everything
		linesOfFiles.forEach((String fileName, List<String> lines) -> {
			// System.out.println("Content of " + fileName + " is:");
			lines.forEach((String line) -> {
				// System.out.println(line);

				PrintWriter out = null;
				try {
					out = new PrintWriter(
							new FileWriter("/home/riky/eclipse-workspace/Banking_System/Files/final.txt", true), true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.write(line + "\n");
				out.close();
			});
			// System.out.println("————————————————————————————————");

		});

	}

	public static void compareFiles() throws IOException {

		collectFiles();

		try (BufferedReader reader1 = new BufferedReader(
				new FileReader("/home/riky/eclipse-workspace/Banking_System/Files/final.txt"));

				BufferedReader readerf = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

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

		compareFiles();

	}
}
