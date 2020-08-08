package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class CheckInput {

	// Regular Lotto

	public static void firstInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber1.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void secondInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber2.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void thirdInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber3.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fourthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber4.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fifthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber5.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void sixthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("SLNumber6.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

// Lottery end

	// First Jackpot

	public static void seventhInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotPrimaryNumber1.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void eighthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotPrimaryNumber2.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void ninthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotPrimaryNumber3.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void tenthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotPrimaryNumber4.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void eleventhInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotPrimaryNumber5.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// Final Jackpot

	public static void tewlvthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotSecondaryNumber1.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void thirteenthInputForLotto() throws IOException {

		try (BufferedReader reader1 = new BufferedReader(new FileReader("jackpotSecondaryNumber2.txt"));

				BufferedReader reader2 = new BufferedReader(new FileReader("unluckyNumber.txt"))) {

			HashSet<String> file1 = new HashSet<String>();

			String s = null;
			while ((s = reader1.readLine()) != null) {
				file1.add(s);
			}

			while ((s = reader2.readLine()) != null) {
				if (file1.contains(s)) {

					System.out.println(s);

				}

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
