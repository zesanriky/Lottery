package Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SecondJackpot implements JackpotSecondaryImpl {

	public void jackpotSecondary() throws IOException {

		for (;;) {
			int[] lot = new int[2];

			int k = 0;
			do {

				lot[k] = (int) (Math.random() * 10);

				k++;

			} while (k < lot.length);

			int number1;

			System.out.println("\n Now you are playing Jackpot 2aus10 for another try \n");

			System.out.println("\nIn order to winn lottery enter a number between 1 and 10 \n"
					+ "And remember that u can only enter each number once \n\n Let's start enter a number to win! ");

			Scanner input1 = new Scanner(System.in);

			while (!input1.hasNextInt()) {
				System.out.println("Input is not a number.");
				input1.nextLine();
			}

			number1 = input1.nextInt();

			int num1 = 0, num2 = 0;

			if (number1 > 1 && number1 < 10) {

				FileWriter fileSecondaryJackpot1 = new FileWriter("jackpotSecondaryNumber1.txt");
				fileSecondaryJackpot1.write("\n" + number1);
				fileSecondaryJackpot1.close();

				new CheckInput();
				CheckInput.tewlvthInputForLotto();

				System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

				Scanner sc1 = new Scanner(System.in);
				String in1 = sc1.nextLine();

				if (in1.equalsIgnoreCase("p")) {

					System.out.println("Proceeding.....");

					if (number1 == lot[0]) {
						System.out.println("Congratulation! you are so lucky you have won lottery on the first try !");

						System.exit(0);
					}

					else
						System.out.println(
								"you are not lucky enough , but you have one chance left try again! \n Enter another number");
					num1 = number1;

					FileWriter fileSecondaryJackpot11 = new FileWriter("unluckyNumber.txt", true);
					fileSecondaryJackpot11.write("\n" + number1);
					fileSecondaryJackpot11.close();

					Scanner input2 = new Scanner(System.in);

					while (!input2.hasNextInt()) {
						System.out.println("Input is not a number.");
						input2.nextLine();
					}

					int number2 = input2.nextInt();

					if (number2 > 1 && number2 < 10)

					{
						FileWriter fileSecondaryJackpot2 = new FileWriter("jackpotSecondaryNumber2.txt");
						fileSecondaryJackpot2.write("\n" + number2);
						fileSecondaryJackpot2.close();

						new CheckInput();
						CheckInput.thirteenthInputForLotto();

						System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

						Scanner sc2 = new Scanner(System.in);
						String in2 = sc2.nextLine();

						if (in2.equalsIgnoreCase("p")) {

							System.out.println("Proceeding.....");

							if (number2 != number1) {

								if (number2 == lot[1]) {
									System.out.println("Congratulation! What a chance, at last try  You have won lottery!");

									System.exit(0);
								} else
									System.out.println(
											"\n Sorry you have already tried tow times, may be it's not your day! Bye bye");

								System.out.println(" Saving unlucky numbers in a file");

								FileWriter fw = new FileWriter("unluckyNumber.txt", true);
								fw.write("\n" + num1 + "\n" + num2);
								fw.close();

								num2 = number2;

								FileWriter fileSecondaryJackpot22 = new FileWriter("unluckyNumber.txt", true);
								fileSecondaryJackpot22.write("\n" + number2);
								fileSecondaryJackpot22.close();

								int arr[] = { num1, num2 };

								for (int i = 0; i < arr.length; i++) {
									Arrays.sort(arr);
									System.out.println(
											" Presenting the betting series for Second Jackpot in ascending order");
									System.out.println(arr[i]);
								}

								new VarifyInput();
								VarifyInput.calculateAll();
								;

							}

						}

						if (in2.equalsIgnoreCase("r")) {

							System.out.println("The Game is just restarted");

							new StandardLottery().regularLottery();
						}

					}
				}

				if (in1.equalsIgnoreCase("r")) {

					System.out.println("The Game is just restarted");

					new StandardLottery().regularLottery();
				}

			}

			else {

				System.out.println("The input is out of range" + number1);
			}

		}

	}

}
