/**
 * 
 */
package assignment.one;

/**
 * @author andrewwerling
 *
 */
public class AsteriskPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("1)");
		asteriskPrinterOne(4);

		System.out.println("\n");
		System.out.println("2)");
		asteriskPrinterTwo(4);
		
		System.out.println("\n");
		System.out.println("3)");
		asteriskPrinterThree(7);
		
		System.out.println("\n");
		System.out.println("4)");
		asteriskPrinterFour(7);

	}

	/**
	 * @param size
	 */
	public static void asteriskPrinterOne(int size) {

		int outerLoop;
		int innerLoop;
		int counter = -1;

		// # of lines printed/size of pyramid - pulls from int size parameter

		for (outerLoop = 0; outerLoop < size; outerLoop++) {

			// # of columns based on size in outerLoop
			counter++;

			for (innerLoop = 0; innerLoop <= outerLoop; innerLoop++) {

				// prints the asterisk "*"
				System.out.print("*");

				counter++;

			}

			// prints new line

			System.out.println();
		}
		// prints hyphens under pyramid
		for (int i = 0; i < counter - size; ++i) {
			System.out.print("- ");
		}
	}

	/**
	 * @param size
	 */
	public static void asteriskPrinterTwo(int size) {

		int outerLoop;
		int innerLoop;
		int counter = 0;

		// # of lines printed/size of pyramid - pulls from int size parameter

		for (outerLoop = size; outerLoop > 0; outerLoop--) {

			// # of columns based on size in outerLoop
			counter++;

			for (innerLoop = 0; innerLoop < outerLoop; innerLoop++) {

				// prints the asterisk "*"
				System.out.print("*");

				counter++;

			}

			// prints new line

			System.out.println();
		}
		// prints hyphens under pyramid
		for (int i = 0; i < counter - size; ++i) {
			System.out.print("- ");
		}
	}
	
	/**
	 * @param size
	 */
	public static void asteriskPrinterThree(int size) {

		int outerLoop;
		int innerLoop;
		int counter = -2;

		// # of lines printed/size of pyramid - pulls from int size parameter
		for (outerLoop = 0 ; outerLoop < size ; outerLoop++) {
			
			// skip to next loop iteration if even
			if ((outerLoop +1) % 2==0)
				continue;
			counter++;
			
			
			// prints spaces based of size parameter and outerLoop
			for (innerLoop = size - outerLoop; innerLoop > 1 ; innerLoop--) {
				System.out.print(" ");
			}
			
			// prints asterisks based on outerLoop
			for (innerLoop = 0; innerLoop <= outerLoop; innerLoop++) {
				System.out.print("* ");
				counter++;
			}
			
			// prints new line
			System.out.println();
		}
		
		
		// prints hyphens under pyramid
		for (int i = 0; i < counter - size; ++i) {
			System.out.print("- ");
		}
	}
	
	/**
	 * @param size
	 */
	public static void asteriskPrinterFour(int size) {

		int outerLoop;
		int innerLoop;
		int counter = -1;

		// # of lines printed/size of pyramid - pulls from int size parameter
		for (outerLoop = size -1 ; outerLoop >= 0 ; --outerLoop) {
			
			// skip to next loop iteration if even
			if ((outerLoop +1) % 2==0)
				continue;
			counter++;
			
			// print spaces
			for (innerLoop = size - outerLoop ; innerLoop > 0 ; innerLoop--) {
				System.out.print(" ");
			}
			
			// print asterisks
			for (innerLoop = 0 ; innerLoop <= outerLoop ; innerLoop++) {
				System.out.print("* ");
				counter++;
			}
			
			System.out.println();
		}
		
		
		// prints hyphens under pyramid
		for (int i = 0; i < counter - size; ++i) {
			System.out.print("- ");
		}
	}

}
