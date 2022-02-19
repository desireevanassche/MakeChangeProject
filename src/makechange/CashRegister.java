package makechange;

import java.util.Scanner;

public class CashRegister {

	static double tender, price, change;
	static int quarter, dime, nickel, penny, twenty, ten, five, one;
	static Scanner kb = new Scanner(System.in); // create scanner

	public static void main(String[] args) {

		System.out.println("What is the price of your item? "); // price prompt
		price = (int) Math.round(kb.nextDouble() * 100); // allows to cast double to int, * 100 for more acccuracy
															// without decimals

		System.out.println("How much money was tendered? "); // amount tendered prompt
		tender = (int) Math.round(kb.nextDouble() * 100);

		if (tender > price)
			System.out.println("Chanage due: " + (tender - price) / 100); // must divide by 100 here since 
																		
		change = tender - price;

		twenty = (int) (change / 2000); // casting

		change = change % 2000; // had to move decimal place over since I multiplied by 100 earlier I have to
								// divide by 2000 now
		
		System.out.println(twenty + " Twenty Dollar Bills");

		ten = (int) (change / 1000);
		if (ten > 0) {
			change = change % 1000;
			System.out.println(ten + " Ten Dollar Bills");
		}
		five = (int) (change / 500);
		if (five > 0) {
			change = change % 500;
			System.out.println(five + " Five Dollar Bills");
		}
		one = (int) (change / 100);
		if (one > 0) {
			change = change % 100;
			System.out.println(one + " One dollar Bills");
		}
		quarter = (int) (change / 25);
		if (quarter > 0) {
			change = change % 25;
			System.out.println(quarter + " Quarters");
		}
		dime = (int) (change / 10);
		if (dime > 0) {
			change = change % 10;
			System.out.println(dime + " Dimes");
		}
		nickel = (int) (change / 5);
		if (nickel > 0) {
			change = change % 5;
			System.out.println(nickel + " Nickles");
		}
		penny = (int) (change);
		System.out.println(penny + " Pennies");

		if (tender < price) {
			System.out.println("Not enough money tendered, please try again."); //not enough message 

		}
		else if (tender == change) {
			System.out.println("This is the total amount due. Have a nice day!"); // correct amount message
		}
	}
}
