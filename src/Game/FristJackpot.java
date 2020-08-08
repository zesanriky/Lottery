package Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FristJackpot implements JackpotPrimaryImpl {

	public void jackpotPrimary() throws IOException {

		String foo = "\n Here are the following unlucky numbers:";
		FileWriter fwEmpty = new FileWriter("unluckyNumber.txt", true);
		fwEmpty.write(foo);
		fwEmpty.close();

		for (;;) {
			int[] lot = new int[5];

			int k = 0;
			do {

				lot[k] = (int) (Math.random() * 10);

				k++;

			} while (k < lot.length);

			int number1;

			int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

			Scanner input1 = new Scanner(System.in);

			while (!input1.hasNextInt()) {
				System.out.println("Input is not a number.");
				input1.nextLine();
			}

			number1 = input1.nextInt();

			if (number1 > 1 && number1 < 50)

			{

				FileWriter filePrimaryJackpot1 = new FileWriter("jackpotPrimaryNumber1.txt");
				filePrimaryJackpot1.write("\n" + number1);
				filePrimaryJackpot1.close();

				new CheckInput();
				CheckInput.seventhInputForLotto();

				System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

				Scanner sc1 = new Scanner(System.in);
				String in1 = sc1.nextLine();

				if (in1.equalsIgnoreCase("p")) {

					if (number1 == lot[0]) {
						System.out.println("you are so lucky you have won lottery on the first try !");
						System.exit(0);
					}

					else
						System.out.println("you are not lucky enough try again! \n Enter another number");

					FileWriter filePrimaryJackpot11 = new FileWriter("unluckyNumber.txt", true);
					filePrimaryJackpot11.write("\n" + number1);
					filePrimaryJackpot11.close();

					num1 = number1;

					int number2;

					Scanner input2 = new Scanner(System.in);

					while (!input2.hasNextInt()) {
						System.out.println("Input is not a number.");
						input2.nextLine();
					}
					number2 = input2.nextInt();

					if (number2 > 1 && number2 < 50)

					{

						FileWriter filePrimaryJackpot2 = new FileWriter("jackpotPrimaryNumber2.txt");
						filePrimaryJackpot2.write("\n" + number2);
						filePrimaryJackpot2.close();

						new CheckInput();
						CheckInput.eighthInputForLotto();

						System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

						Scanner sc2 = new Scanner(System.in);
						String in2 = sc2.nextLine();

						if (in2.equalsIgnoreCase("p")) {

							if (number2 != number1) {
								if (number2 == lot[1]) {

									System.out.println("you have won lottery!");
									System.exit(0);
								}

								else
									System.out.println("you are not lucky enough try again! \n Enter another number");

								num2 = number2;

								FileWriter filePrimaryJackpot22 = new FileWriter("unluckyNumber.txt", true);
								filePrimaryJackpot22.write("\n" + number2);
								filePrimaryJackpot22.close();

							} else {

								System.out.println("You have already entered that number try another one");

							}

							Scanner input3 = new Scanner(System.in);

							while (!input3.hasNextInt()) {
								System.out.println("Input is not a number.");
								input3.nextLine();
							}

							int number3 = input3.nextInt();

							if (number3 > 1 && number3 < 50)

							{

								FileWriter filePrimaryJackpot3 = new FileWriter("jackpotPrimaryNumber3.txt");
								filePrimaryJackpot3.write("\n" + number3);
								filePrimaryJackpot3.close();

								new CheckInput();
								CheckInput.ninthInputForLotto();

								System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

								Scanner sc3 = new Scanner(System.in);
								String in3 = sc3.nextLine();

								if (in3.equalsIgnoreCase("p")) {

									if (number3 != number1 && number3 != number2) {
										if (number3 == lot[2]) {
											System.out.println("You have won lottery!");
											System.exit(0);
										} else
											System.out.println(
													"you are not lucky enough try again! \n Enter another number");
										num3 = number3;

										FileWriter filePrimaryJackpot33 = new FileWriter("unluckyNumber.txt", true);
										filePrimaryJackpot33.write("\n" + number3);
										filePrimaryJackpot33.close();

									} else {
										System.out.println("You have already entered that number try another one");
									}

									Scanner input4 = new Scanner(System.in);

									while (!input4.hasNextInt()) {
										System.out.println("Input is not a number.");
										input4.nextLine();
									}

									int number4 = input4.nextInt();

									if (number4 > 1 && number4 < 50)

									{

										FileWriter filePrimaryJackpot4 = new FileWriter("jackpotPrimaryNumber4.txt");
										filePrimaryJackpot4.write("\n" + number4);
										filePrimaryJackpot4.close();

										new CheckInput();
										CheckInput.tenthInputForLotto();

										System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

										Scanner sc4 = new Scanner(System.in);
										String in4 = sc4.nextLine();

										if (in4.equalsIgnoreCase("p")) {

											System.out.println("Proceeding.....");

											if (number4 != number1 && number4 != number2 && number4 != number3) {
												if (number4 == lot[3]) {
													System.out.println("You have won lottery!");
													System.exit(0);
												} else
													System.out.println(
															"you are not lucky enough , but you have one chance left try again! \n Enter another number");
												num4 = number4;

												FileWriter filePrimaryJackpot44 = new FileWriter("unluckyNumber.txt",
														true);
												filePrimaryJackpot44.write("\n" + number4);
												filePrimaryJackpot44.close();

											}

											else {
												System.out.println(
														"You have already entered that number try another one");
											}

											Scanner input5 = new Scanner(System.in);

											while (!input5.hasNextInt()) {
												System.out.println("Input is not a number.");
												input5.nextLine();
											}
											int number5 = input5.nextInt();

											if (number5 > 1 && number5 < 50)

											{

												FileWriter filePrimaryJackpot5 = new FileWriter(
														"jackpotPrimaryNumber5.txt");
												filePrimaryJackpot5.write("\n" + number5);
												filePrimaryJackpot5.close();

												new CheckInput();
												CheckInput.eleventhInputForLotto();

												System.out
														.println("Press 'P' to proceed or 'R' for restarting the Game");

												Scanner sc5 = new Scanner(System.in);
												String in5 = sc5.nextLine();

												if (in5.equalsIgnoreCase("p")) {

													System.out.println("Proceeding.....");

													if (number5 != number1 && number5 != number2 && number5 != number3
															&& number5 != number4) {
														if (number5 == lot[4]) {
															System.out.println("You have won lottery!");
															System.exit(0);
														} else

															System.out.println(
																	"\n Sorry you have already tried five times, may be it's not your day! Bye bye");
														num5 = number5;

														FileWriter filePrimaryJackpot55 = new FileWriter(
																"unluckyNumber.txt", true);
														filePrimaryJackpot55.write("\n" + number5);
														filePrimaryJackpot55.close();

														int arr[] = { num1, num2, num3, num4, num5 };

														for (int i = 0; i < arr.length; i++) {
															Arrays.sort(arr);
															System.out.println(
																	" Presenting the betting series for Frist Jackpot in ascending order ");
															System.out.println(arr[i]);
														}

														new SecondJackpot().jackpotSecondary();

													}

												}

												if (in5.equalsIgnoreCase("r")) {

													System.out.println("The Game is just restarted");

													new StandardLottery().regularLottery();
												}
											}
										}

										if (in4.equalsIgnoreCase("r")) {

											System.out.println("The Game is just restarted");

											new StandardLottery().regularLottery();

										}
									}
								}

								if (in3.equalsIgnoreCase("r")) {

									System.out.println("The Game is just restarted");

									new StandardLottery().regularLottery();
								}

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

			else

			{

				System.out.println("The input is out of range" + number1);

			}

		}
	}

}