/**
 * 
 */
package assignment.ListAllFilesAndDirectories;

import java.io.File;
import java.nio.file.Path;
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
			Path filePath = null;
			Scanner userInput = new Scanner(System.in);

			while (filePath == null) {
				
				System.out.println("Please enter the desired directory to search (absolute or relative file path:");
				// Get desired file path from user input via scanner 
				String directoryPath = userInput.next();
				
				// Create a new file object from directoryPath
				File directoryAsFile = new File(directoryPath);
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
