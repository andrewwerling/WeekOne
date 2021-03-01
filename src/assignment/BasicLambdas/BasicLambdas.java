/**
 * 
 */
package assignment.BasicLambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
//		song.sort((aName, bName) -> aName.compareTo(bName));
		song.sort(String::compareToIgnoreCase);
		System.out.print(song.toString());

		System.out.println("\n\nSort Array by Strings that start with the letter e\n-------------------------------");
//		Arrays.sort(song.toArray(), Comparator.comparingInt(x -> (((String) x).contains("e") || ((String) x).contains("E") ? 0 : 1)));
		song.stream().sorted((aName, bName) -> {
			
			boolean aNameE = aName.contains("e");
			boolean bNameE = bName.contains("e");
			
			if (aNameE && bNameE) {
				return 0;
			} else if (aNameE && !bNameE) {
				return -1;
			} else {
				return 1;
			}
		}).forEach(System.out::println);
	}

}
