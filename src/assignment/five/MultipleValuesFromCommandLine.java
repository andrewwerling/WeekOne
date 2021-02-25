/**
 * 
 */
package assignment.five;

import java.util.Scanner;

/**
 * @author andrewwerling
 *
 */
public class MultipleValuesFromCommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Integer numOfValuesDesired = 0;
//		Integer valueArray[] = new Integer[100];
			Integer grandSum = 0;

			// Scanner to get input from user
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many numbers would you like to sum?");
			numOfValuesDesired = userInput.nextInt();
			System.out.println("Enter each number one by one, press enter to input the next number.");
			for (Integer i = 0; i < numOfValuesDesired; i++) {
				grandSum += userInput.nextInt();
				
			}
			userInput.close();
			System.out.println("You chose to input " + numOfValuesDesired + "values and the sum of these values is " + grandSum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, only integers allowed at this time!\nRestart the program to go again.");
		}
	}
}
