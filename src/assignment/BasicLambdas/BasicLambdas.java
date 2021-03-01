/**
 * 
 */
package assignment.BasicLambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * @author andrewwerling
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Array to sort
		List<String> song = Arrays.asList("gently", "down", "the", "stream", "eGently", "eDown", "eThe", "eStream");
		
		System.out.println("Sort Array from shortest to longest\n-------------------------------");
		// Sort array from shortest to longest
		Comparator<String> compLengthShortest = (aName, bName) -> aName.length() - bName.length();
		song.stream().sorted(compLengthShortest).forEach(System.out::println);
		
		System.out.println("\nSort Array from longest to shortest\n-------------------------------");
		// Sort array from longest to shortest
		Comparator<String> compLengthLongest = (aName, bName) -> bName.length() - aName.length();
		song.stream().sorted(compLengthLongest).forEach(System.out::println);
		
		System.out.println("\nSort Array alphabeticallly\n-------------------------------");
		// Sort array alphabetically
		song.sort((aName, bName) -> aName.compareTo(bName));
		System.out.print(song.toString());
		
	}

}
