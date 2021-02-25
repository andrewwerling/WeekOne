/**
 * 
 */
package assignment.six;

import java.io.File;
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
			// put given directory here as String value
			String directoryPath = "/Users/andrewwerling/Documents";
			
			// Create a new file object from directoryPath
			File directoryAsFile = new File(directoryPath);
			
			// Create string array of all files/directories from directoryAsFile object
			String[] fileList = directoryAsFile.list();
			
			// Loop through fileList and print name of file/directory
			for (String fileName: fileList) {
				System.out.println(fileName);
			}
			
		} catch (Exception FileNotFoundException) {
			
			System.out.println("Directory or file doesn not exist or was improperly entered");
		}
	}

}
