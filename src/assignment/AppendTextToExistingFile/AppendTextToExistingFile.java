/**
 * 
 */
package assignment.AppendTextToExistingFile;

import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author andrewwerling
 *
 */
public class AppendTextToExistingFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Try with resources
		try (FileWriter fileWriter = new FileWriter("appendToThisFile.txt", true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);) {
			
			printWriter.println("this text gets appended to the file!");
			printWriter.println("another line to get appended to the file!");
			printWriter.println("one last line to append! All done");
			
			System.out.println("Success, text written to file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
