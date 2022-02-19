package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
			// Create scanner to accept user input
			 Scanner kb = new Scanner(System.in);

			
			// Prompt user: price of item
			System.out.println("What is the price of your item? ");
			double price = kb.nextDouble();

			// Prompt user: money tendered
			System.out.println("How much money was tendered? ");
			double tender = kb.nextDouble();
			
			double change = (tender - price);
			
			changeLoop(); // tender - cost?? 

			// Display a message - did customer provide too little or too much $
			// If tendered > cost, display the number of bills & coins to be returned (if else?) 
			
		}

			//create a method for a loop - if else? 
			public static void changeLoop() {
				
			}
			
			
			//if (change % 4 == 0) quarter
			// else if (change % 10 == 0) dime 
			// else if (change % 5 == 0) nickel  
			// else if (change % 1 == 0 penny 




	}
