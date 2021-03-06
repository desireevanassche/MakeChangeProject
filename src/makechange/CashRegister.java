package makechange;

import java.util.Scanner;

public class CashRegister {
	static double tender, price, change;
	static int quarter, dime, nickel, penny, twenty, ten, five, one;

	static Scanner kb = new Scanner(System.in); // create scanner

	public static void main(String[] args) {

		promptUser();
		checkMoney();
		changeLoop();

	}

	public static void promptUser() {

		System.out.println("What is the price of your item? "); // price prompt
		price = (int) (kb.nextDouble() * 100); // cast double to int | * 100 moves decimal place over two places,
												// creating accuracy

		System.out.println("How much money was tendered? "); // amount tendered prompt
		tender = (int) (kb.nextDouble() * 100);

		change = (int) (tender - price);

	} // end prompt user

	public static void changeLoop() {
		if (tender > price) {
			System.out.println("Chanage due: " + (tender - price) / 100); // /100 mainitains decimal placce movement

			twenty = (int) (change / 2000); // casting

			if (twenty > 0) {
				change = change % 2000; // mainitng the decimal lace movement
				if (twenty == 1) { // nested if to out print for singular and plural change
					System.out.println(twenty + " Twenty Dollar Bill");
				} else
					System.out.println(twenty + " Twenty Dollar Bills");
			}

			ten = (int) (change / 1000);

			if (ten > 0) {
				change = change % 1000;
				if (ten == 1) {
					System.out.println(ten + " Ten Dollar Bill");
				} else
					System.out.println(ten + "Ten Dollar Bills");
			}

			five = (int) (change / 500);

			if (five > 0) {
				change = change % 500;
				if (five == 1) {
					System.out.println(five + " Five Dollar Bill");
				} else
					System.out.println(five + " Five Dollar Bills");
			}

			one = (int) (change / 100);

			if (one > 0) {
				change = change % 100;
				if (one == 1) {
					System.out.println(one + " One Dollar Bill");
				} else
					System.out.println(one + " One Dollar Bills");
			}

			quarter = (int) (change / 25);

			if (quarter > 0) {
				change = change % 25;
				if (quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else	System.out.println(quarter + " Quarters");
			}

			dime = (int) (change / 10);

			if (dime > 0) {
				change = change % 10;
				if (dime == 1) {
					System.out.println(dime + " Dime");
				} else System.out.println(dime + " Dimes");
			}

			nickel = (int) (change / 5);

			if (nickel > 0) {
				change = change % 5;
				if (nickel == 1) {
					System.out.println(nickel + " Nickle");
				} else System.out.println((nickel + " Nickels"));
			}
			penny = (int) (change / 1);

			if (penny > 0) {
				penny = (int) (change);
				if (penny != 1) {
					System.out.println(penny + " Pennies");
					
				} else System.out.println(penny + " Penny");

			}
		}
	} // end change loop

	public static void checkMoney() {
		
		if (tender == price) {
			System.out.println("This is the total amount due. Have a nice day!"); // correct amount message
		}
		else if (tender < price) {
			System.out.println("ERROR. Not enough money tendered, please try again."); // not enough message
			promptUser();
			
		}
	} // end checkMoney
}
