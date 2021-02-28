/**
 * 
 */
package assignment.ListAllFilesAndDirectories;

import java.io.File;
import java.util.Scanner;

/**
 * @author andrewwerling
 *
 */
public class ListAllFilesAndDirectories {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String directoryPath = null;
			Scanner userInput = new Scanner(System.in);


			while (directoryPath == null) {
				
				System.out.println("Please enter the desired directory to search (absolute or relative file path:");
				// Get desired file path from user input via scanner 
				directoryPath = userInput.next();
				// Create a new file object from directoryPath
				File directoryAsFile = new File(directoryPath);
				if (!directoryAsFile.exists()) {
					directoryPath = null;
					System.out.println(userInput + " does not exist on this system!");
					System.out.println("Please enter the desired directory to search (absolute or relative file path: ");
				} else {
					
				}
				
				// Create string array of all files/directories from directoryAsFile object
				String[] fileList = directoryAsFile.list();
				// Loop through fileList and print name of file/directory
				for (String fileName : fileList) {
					
					System.out.println(fileName);
				}
			}
			userInput.close();
			System.exit(0);
			
		} catch (Exception FileNotFoundException) {
			
			System.out.println("Directory or file doesn not exist or was improperly entered");
		}
		System.exit(0);
	}

}
