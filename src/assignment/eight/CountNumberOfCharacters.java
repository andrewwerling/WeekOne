/**
 * 
 */
package assignment.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author andrewwerling
 *
 */
public class CountNumberOfCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Scanner object to get user input
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a character to search and press enter");

		String fromConsole = userInput.next();

		char chosenCharacter = fromConsole.charAt(0);

		System.out.println("\"" + chosenCharacter + "\" occured " + countCharacter(chosenCharacter) + " times.");

		userInput.close();
	}

	static Integer countCharacter(char chosenCharacter) {
		// Integer to count occurrences of chosenCharacter
		Integer characterCount = 0;

		try {

			// file to search in
			String directoryPath = "appendToThisFile.txt";

			// Create a new file object from directoryPath
			File chosenFile = new File(directoryPath);

			BufferedReader inputStream = new BufferedReader(new FileReader(chosenFile));

			String line = null;
			while ((line = inputStream.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == chosenCharacter) {
						characterCount++;
					}
				}
			}

			inputStream.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return characterCount;

	}

}
