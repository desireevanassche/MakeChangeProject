package makechange;

import java.util.Scanner;

public class CashRegister {

	static double tender, price, change;
	// Create scanner to accept user input
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// Prompt user: price of item

		promptUser();

		correctAmount();
	}

	public static void promptUser() {

		System.out.println("What is the price of your item? ");
		price = kb.nextDouble();

		// Prompt user: money tendered
		System.out.println("How much money was tendered? ");
		tender = kb.nextDouble();
	}

	public static void correctAmount() { // check tender
		if (tender < price) {
			System.out.println("Not enough money tendered, please try again.");
			promptUser();
		} else if (tender == change) {
			System.out.println("This is the total amount due. Have a nice day!");
		}

		// changeLoop(price, tender); // tender - cost??

		// If tendered > cost, display the number of bills & coins to be returned (if
		// else?)
		// create a method for a loop - if else?

		// while (change != 0) {
		// if ()
	}
	// public static void changeLoop(double price, double tender) {
	// double change = (tender - price);
	// }
	// if (change % 4 == 0) quarter
	// else if (change % 10 == 0) dime
	// else if (change % 5 == 0) nickel
	// else if (change % 1 == 0 penny

}
