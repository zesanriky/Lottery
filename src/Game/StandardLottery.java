package Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StandardLottery implements RegularLotteryImpl {

	public void regularLottery() throws IOException {

		String foo = "\n Here are the following unlucky numbers:";
		FileWriter fwEmpty = new FileWriter("unluckyNumber.txt", true);
		fwEmpty.write(foo);
		fwEmpty.close();

		for (;;) {
			int[] lot = new int[6];

			int k = 0;
			do {

				lot[k] = (int) (Math.random() * 10);

				k++;

			} while (k < lot.length);

			int number1;

			boolean check = false;

			Scanner myObj = new Scanner(System.in); // Create a Scanner object

			System.out.println("\n Welcome to play online Lottery");

			System.out.println("\n Whic Lottery do you like to play?" + "\n type 'LOTTO' for playing 6aus49"
					+ "\n or 'JACKPOT'for (5aus50 plus 2aus10) \n");
			System.out.println("\n If not defined, a lottery would be selected for Lotto 6aus49 as default \n");

			String userName = myObj.nextLine(); // Read user input

			if ("LOTTO".equalsIgnoreCase(userName) || (userName.isEmpty())) {

				System.out.println("You typed: " + userName);

				System.out.println("\n You are now playing LOTTO \n");

				Scanner input1 = new Scanner(System.in);

				System.out.println("\nIn order to winn lottery enter a number between 1 and 49 \n"
						+ "And remember that u can only enter each number once \n\n Let's start enter a number to win! ");

				System.out
						.println("If you see after input the same number printed,\n it means you have already used it");

				while (!input1.hasNextInt()) {
					System.out.println("Input is not a number.");
					input1.nextLine();
				}

				number1 = input1.nextInt();

				if (number1 > 1 && number1 < 49)

				{

					FileWriter fileWriteLotto1 = new FileWriter("SLNumber1.txt");
					fileWriteLotto1.write("\n" + number1);
					fileWriteLotto1.close();

					new CheckInput();
					CheckInput.firstInputForLotto();

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
							System.out.println("you are not lucky enough try again! \n Enter another number");

						FileWriter fileWriteLotto11 = new FileWriter("unluckyNumber.txt", true);
						fileWriteLotto11.write("\n" + number1);
						fileWriteLotto11.close();

						int number2;

						Scanner input2 = new Scanner(System.in);

						while (!input2.hasNextInt()) {
							System.out.println("Input is not a number.");
							input2.nextLine();
						}
						number2 = input2.nextInt();

						if (number2 > 1 && number2 < 49)

						{

							FileWriter fileWriteLotto2 = new FileWriter("SLNumber2.txt");
							fileWriteLotto2.write("\n" + number2);
							fileWriteLotto2.close();

							new CheckInput();
							CheckInput.secondInputForLotto();

							System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

							Scanner sc2 = new Scanner(System.in);
							String in2 = sc2.nextLine();

							if (in2.equalsIgnoreCase("p")) {

								System.out.println("Proceeding.....");

								if (number2 != number1) {
									if (number2 == lot[1]) {

										System.out.println("Congratulation! you have won lottery!");
										System.exit(0);
									}

									else
										System.out
												.println("you are not lucky enough try again! \n Enter another number");

									FileWriter fileWriteLotto22 = new FileWriter("unluckyNumber.txt", true);
									fileWriteLotto22.write("\n" + number2);
									fileWriteLotto22.close();

								} else {

									System.out.println("You have already entered that number try another one");

								}

								Scanner input3 = new Scanner(System.in);

								while (!input3.hasNextInt()) {
									System.out.println("Input is not a number.");
									input3.nextLine();
								}

								int number3 = input3.nextInt();

								if (number3 > 1 && number3 < 49)

								{

									FileWriter fileWriteLotto3 = new FileWriter("SLNumber3.txt");
									fileWriteLotto3.write("\n" + number3);
									fileWriteLotto3.close();

									new CheckInput();
									CheckInput.thirdInputForLotto();

									System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

									Scanner sc3 = new Scanner(System.in);
									String in3 = sc3.nextLine();

									if (in3.equalsIgnoreCase("p")) {

										System.out.println("Proceeding.....");

										if (number3 != number1 && number3 != number2) {
											if (number3 == lot[2]) {
												System.out.println("Congratulation! You have won lottery!");
												System.exit(0);
											} else
												System.out.println(
														"you are not lucky enough try again! \n Enter another number");

											FileWriter fileWriteLotto33 = new FileWriter("unluckyNumber.txt", true);
											fileWriteLotto33.write("\n" + number3);
											fileWriteLotto33.close();

										} else {
											System.out.println("You have already entered that number try another one");
										}

										Scanner input4 = new Scanner(System.in);

										while (!input4.hasNextInt()) {
											System.out.println("Input is not a number.");
											input4.nextLine();
										}

										int number4 = input4.nextInt();

										if (number4 > 1 && number4 < 49)

										{

											FileWriter fileWriteLotto4 = new FileWriter("SLNumber4.txt");
											fileWriteLotto4.write("\n" + number4);
											fileWriteLotto4.close();

											new CheckInput();
											CheckInput.fourthInputForLotto();

											System.out.println("Press 'P' to proceed or 'R' for restarting the Game");

											Scanner sc4 = new Scanner(System.in);
											String in4 = sc4.nextLine();

											if (in4.equalsIgnoreCase("p")) {

												System.out.println("Proceeding.....");

												if (number4 != number1 && number4 != number2 && number4 != number3) {
													if (number4 == lot[3]) {
														System.out.println("Congratulation! You have won lottery!");
														System.exit(0);
													} else
														System.out.println(
																"you are not lucky enough try again! \n Enter another number");

													FileWriter fileWriteLotto44 = new FileWriter("unluckyNumber.txt",
															true);
													fileWriteLotto44.write("\n" + number4);
													fileWriteLotto44.close();

												}

												else {
													System.out.println(
															"You have already entered that number try another one");
												}

												//

												Scanner input5 = new Scanner(System.in);

												while (!input5.hasNextInt()) {
													System.out.println("Input is not a number.");
													input5.nextLine();
												}
												int number5 = input5.nextInt();

												if (number5 > 1 && number5 < 49)

												{

													FileWriter fileWriteLotto5 = new FileWriter("SLNumber5.txt");
													fileWriteLotto5.write("\n" + number5);
													fileWriteLotto5.close();

													new CheckInput();
													CheckInput.fifthInputForLotto();

													System.out.println(
															"Press 'P' to proceed or 'R' for restarting the Game");

													Scanner sc5 = new Scanner(System.in);
													String in5 = sc5.nextLine();

													if (in5.equalsIgnoreCase("p")) {

														System.out.println("Proceeding.....");

														if (number5 != number1 && number5 != number2
																&& number5 != number3 && number5 != number4) {
															if (number5 == lot[4]) {
																System.out.println("Congratulation! You have won lottery!");
																System.exit(0);
															} else
																System.out.println(
																		"you are not lucky enough , but you have one chance left try again! \n Enter another number");

															FileWriter fileWriteLotto55 = new FileWriter(
																	"unluckyNumber.txt", true);
															fileWriteLotto55.write("\n" + number5);
															fileWriteLotto55.close();

														}

														else {
															System.out.println(
																	"You have already entered that number try another one \n And remember you have one chance left");
														}

														Scanner input6 = new Scanner(System.in);

														while (!input6.hasNextInt()) {
															System.out.println("Input is not a number.");
															input6.nextLine();
														}
														int number6 = input6.nextInt();

														if (number6 > 1 && number6 < 49)

														{

															FileWriter fileWriteLotto6 = new FileWriter(
																	"SLNumber6.txt");
															fileWriteLotto6.write("\n" + number6);
															fileWriteLotto6.close();

															new CheckInput();
															CheckInput.sixthInputForLotto();

															System.out.println(
																	"Press 'P' to proceed or 'R' for restarting the Game");

															Scanner sc6 = new Scanner(System.in);
															String in6 = sc6.nextLine();

															if (in6.equalsIgnoreCase("p")) {

																System.out.println("Proceeding.....");

																if (number6 != number1 && number6 != number2
																		&& number6 != number3 && number6 != number4
																		&& number6 != number5) {

																	if (number6 == lot[5]) {
																		System.out.println(
																				"Congratulation! What a chance, at last try  You have won lottery!");
																		System.exit(0);
																	} else
																		System.out.println(
																				"\n Sorry you have already tried six times, may be it's not your day! Bye bye");

																	FileWriter fileWriteLotto66 = new FileWriter(
																			"unluckyNumber.txt", true);
																	fileWriteLotto66.write("\n" + number6);
																	fileWriteLotto66.close();

																	new VarifyInput();

																	VarifyInput.calculateAll();

																}
															}

															if (in6.equalsIgnoreCase("r")) {

																System.out.println("The Game is just restarted");

																regularLottery();
															}
														}
													}

													if (in5.equalsIgnoreCase("r")) {

														System.out.println("The Game is just restarted");

														regularLottery();
													}
												}

											}

											if (in4.equalsIgnoreCase("r")) {

												System.out.println("The Game is just restarted");

												regularLottery();
											}
										}
									}

									if (in3.equalsIgnoreCase("r")) {

										System.out.println("The Game is just restarted");

										regularLottery();
									}

								}

							}

							if (in2.equalsIgnoreCase("r")) {

								System.out.println("The Game is just restarted");

								regularLottery();
							}
						}

					}
					if (in1.equalsIgnoreCase("r")) {

						System.out.println("The Game is just restarted");

						regularLottery();
					}

					else {

						System.out.println("The input is out of range" + userName);

					}
				}

			}

			if ("JACKPOT".equalsIgnoreCase(userName))

			{
				System.out.println("\n You are now playing Jackpot 5aus50  \n");

				System.out.println("\nIn order to winn lottery enter sequentially 5 numbers between 1 and 50 \n"
						+ "And remember that u can only enter each number once \n\n Let's start enter a number to win! ");

				System.out
						.println("If you see after input the same number printed,\n it means you have already used it");

				new SecondJackpot().jackpotPrimary();

			} else {

				System.out.println("Only valid string is allowed");
			}

		}
	}

}
