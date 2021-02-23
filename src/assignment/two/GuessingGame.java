/**
 * 
 */
package assignment.two;

import java.util.Random;
import java.util.Scanner;

/**
 * @author andrewwerling
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate random number between 1-100
		Random random = new Random();
		int randomNumber = random.nextInt(100);

		//System.out.println(randomNumber); // used for testing
		
		// variable to keep track of attempts
		int attempts = 0;

		// Scanner to get input from user
		Scanner userInput = new Scanner(System.in);

		// variable to store user's guess
		int guess;

		// ask user for their guess between 1-100
		System.out.println("Guess a number between 1-100");

		// loop five times, this is the limit of guesses
		for (int i = 0; i < 5; i++) {

			// store user's guess in variable "guess"
			guess = userInput.nextInt();

			// if user's guess is correct let them know they win!
			if (guess == randomNumber) {
				System.out.println("Your guessed " + guess + " and were correct, you win!");
				System. exit(0);
			}
			// if user's guess is within 10 of random number let them know they win!
			// also checks to make sure they don't guess a number out of bounds
			else if (guess < (randomNumber + 10) && guess > (randomNumber - 10) && guess > 0 && guess < 100) {
				System.out.println("Your guess " + guess + " was within ten of " + randomNumber + ", you win!");
				System.out.println("Thanks for playing the GuessingGame!");
				System. exit(0);
			}
			// if user's guess is not correct or within ten ask them to try again
			else {
				if (i < 4)
				System.out.println("Your guess " + guess + " was not correct or within 10, guess again!");
				else
				System.out.println("Your guess " + guess + " was not correct or within 10");
			}
		}
		System.out.println("Sorry, Game over! The number was " + randomNumber + "\nOnly 5 attempts allowed, better luck next time!");
		System. exit(0);
	}

}
