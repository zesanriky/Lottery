package Game;



// The documentation of this project is here ----> https://github.com/zesanriky/Banking-System/blob/master/README.md 

import java.io.*;
import java.util.Random;

public class SavingsAccount {
	
	public static int NewRandom(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;// getting the randomizing number		
	}

	public static void main(String args[]) throws IOException, InterruptedException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Bank myBank = new Bank();
		int Option = 1, Account_Number, Account_Password, atempts = 0, Pass;
		String Name;
		double Balance, Money;
		System.out.println("Please wait, the system is starting...");
		while (Option != 6) {
			Thread.sleep(4000);
			System.out.println("1)Sign up for a new account");
			Thread.sleep(250);
			System.out.println("2)Deposit to a bank account");
			Thread.sleep(250);
			System.out.println("3)Withdraw from the bank account");
			Thread.sleep(250);
			System.out.println("4)Print the detailed account information including last transactions");
			Thread.sleep(250);
			System.out.println("5)Transfer money");
			Thread.sleep(250);
			System.out.println("6)Log out");
			System.out.println();
			System.out.print("                       Enter Option [1-6]: ");
			Option = Integer.parseInt(br.readLine());
			switch (Option) {
			case 1:// Setting up an account for a new user
				System.out.println("Enter a customer name :");
				Name = br.readLine();
				System.out.println("Enter a opening balance :");
				Balance = Double.parseDouble(br.readLine());
				Thread.sleep(250);
				System.out.println("Creating your account....");
				Thread.sleep(500);
				int[] arrDetails = myBank.AddNewAccount(Name, Balance);
				System.out.println("Account Has been created\n Account number: " + arrDetails[0] + "\nYour password : "
						+ arrDetails[1]);
				break;
			case 2: // Deposit to a bank account
				System.out.println("Enter a account number :");
				Account_Number = Integer.parseInt(br.readLine());
				System.out.println("Enter a account password :");
				Account_Password = Integer.parseInt(br.readLine());
				System.out.println("Enter a deposit amount :");
				Money = Double.parseDouble(br.readLine());
				myBank.Deposit(Account_Number, Account_Password, Money);
				break;

			case 3:// Withdraw from the bank account
				System.out.println("Enter a account number :");
				Account_Number = Integer.parseInt(br.readLine());
				System.out.println("Enter a account password :");
				Account_Password = Integer.parseInt(br.readLine());
				System.out.println("Enter a amount to withdraw :");
				Money = Double.parseDouble(br.readLine());
				myBank.Withdraw(Account_Number, Account_Password, Money);
				break;
			case 4: // Last transactions detail
				System.out.println("Enter a account number :");
				Account_Number = Integer.parseInt(br.readLine());
				System.out.println("Enter a account password :");
				Account_Password = Integer.parseInt(br.readLine());
				myBank.Transactions(Account_Number, Account_Password);
				break;
			case 5:// Transferring money
				System.out.println("Enter a account number :");
				Account_Number = Integer.parseInt(br.readLine());
				System.out.println("Enter a account password :");
				Account_Password = Integer.parseInt(br.readLine());
				System.out.println("Enter a amount to transfer :");
				Money = Double.parseDouble(br.readLine());
				myBank.Withdraw(Account_Number, Account_Password, Money);
				System.out.println("Enter the receivers account number :");
				Account_Number = Integer.parseInt(br.readLine());
				myBank.Transfer(Account_Number, Money);
				System.out.println("Transferring....");
				Thread.sleep(2000);
				System.out.println("\nTransfer is succesful");
				break;
			case 6:// Logging out from the banking system
				System.out.println(" You are logging out.....");
				Thread.sleep(2000);
				System.out.println("\n Program is terminated");
				break;
			default:// Checking input validation, if an account is created or not
				System.out.println("Invalid option. Please try again.");

			}
		}
	}

	static class Bank {
		private int Password = 2684;
		private BankAccount[] accounts;
		private int numOfAccounts;

		public Bank() {
			accounts = new BankAccount[100]; // Number of accounts
			numOfAccounts = 0;
		}

		public int[] AddNewAccount(String Name, Double Balance) { // Creating new account
			BankAccount b = new BankAccount(Name, Balance);
			accounts[numOfAccounts] = b;
			numOfAccounts++;
			int Acc = b.getAccountNum()[0];// user name
			int Pass = b.getAccountNum()[1];// passowrd
			int[] details = { Acc, Pass };
			return details;
		}

		public void Withdraw(int Account_Number, int pass, double Money) { // Money withdraw method form a specific
																			// account
			for (int i = 0; i < numOfAccounts; i++) {
				int a = accounts[i].getAccountNum()[0];
				if (Account_Number == a) {
					int p = accounts[i].getAccountNum()[1];
					if (pass == p) {
						accounts[i].withdraw(Money);
						return;
					}
				}
			}
			System.out.println("                       You have entered a wrong Account number or Password.");
		}

		public void Deposit(int Account_Number, int pass, double Money) { // Money deposit for a specific account
			for (int i = 0; i < numOfAccounts; i++) {
				int a = accounts[i].getAccountNum()[0];
				if (Account_Number == a) {
					int p = accounts[i].getAccountNum()[1];
					if (pass == p) {
						accounts[i].deposit(Money);
						return;
					}
				}
			}
			System.out.println("                       You have entered a wrong Account number or Password.");
		}

		public void Transfer(int Account_Number, double Money) { // Money transfer from one account to another account
			for (int i = 0; i < numOfAccounts; i++) {
				int a = accounts[i].getAccountNum()[0];
				if (Account_Number == a) {
					int p = accounts[i].getAccountNum()[1];
					if (Money != p) {
						accounts[i].deposit(Money);
						return;
					}
				}
			}
			System.out.println("                       You have entered a wrong Account number or Password.");
		}

		public void Transactions(int Account_Number, int pass) { // Transaction detail of a particular account
			for (int i = 0; i < numOfAccounts; i++) {
				int a = accounts[i].getAccountNum()[0];
				if (Account_Number == a) {
					int p = accounts[i].getAccountNum()[1];
					if (pass == p) {
						System.out.println(accounts[i].getAccountInfo());
						System.out.println("                        Last transaction: "
								+ accounts[i].getTransactionInfo(accounts[i].getNumberOfTransactions() - 1));
						return;
					}
				}
			}
			System.out.println("                       You have entered a wrong Account number or Password.");
		}
	}

	static class BankAccount {
		private int User_Password;
		private int accountNum;
		private String customerName;
		private double balance;
		private double[] transactions;
		private String[] transactionsSummary;
		private int numOfTransactions;
		private static int noOfAccounts = 0;

		public String getAccountInfo() { // Fetching account information
			return "                        Account number: " + accountNum + "\n                        Customer Name: "
					+ customerName + "\n                        Balance:" + balance + "\n";
		}

		public String getTransactionInfo(int n) { // Fetching transaction summary
			String transaction = transactionsSummary[n];
			return transaction;
		}

		public BankAccount(String abc, double xyz) {
			customerName = abc;
			balance = xyz;
			noOfAccounts++;
			User_Password = NewRandom(1000, 9999);
			accountNum = NewRandom(800000000, 999999999);
			transactions = new double[100];
			transactionsSummary = new String[100];
			transactions[0] = balance;
			transactionsSummary[0] = "A balance of : Euro" + Double.toString(balance) + " was deposited.";
			numOfTransactions = 1;
		}

		public int[] getAccountNum() { // Fetching account detail
			int account = accountNum;
			int Pass = User_Password;
			int[] details = { account, Pass };
			return details;
		}

		public int getNumberOfTransactions() { // Fetching number of transactions
			return numOfTransactions;
		}

		public void deposit(double amount) { // Amount depositing calculation
			if (amount <= 0) {
				System.out.println("Amount to be deposited should be positive");
			} else {
				balance = balance + amount;
				transactions[numOfTransactions] = amount;
				transactionsSummary[numOfTransactions] = "Euro." + Double.toString(amount) + " was deposited.";
				numOfTransactions++;
				System.out.println("                       Amount deposited successfully");
			}
		}

		public void withdraw(double amount) { // Amount withdrawing calculation
			if (amount <= 0) {
				System.out.println("Amount to be withdrawn should be positive");
			} else {
				if (balance < amount) {
					System.out.println("Insufficient balance");
				} else {
					balance = balance - amount;
					transactions[numOfTransactions] = amount;
					transactionsSummary[numOfTransactions] = "Euro." + Double.toString(amount) + " was withdrawn.";
					numOfTransactions++;
					System.out.println("                       Amount Withdrawn successfully");
				}
			}
		}
	}
}