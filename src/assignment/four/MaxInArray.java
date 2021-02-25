/**
 * 
 */
package assignment.four;

/**
 * @author andrewwerling
 *
 */
public class MaxInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer max = 0;
		Integer rowCount = 0;
		Integer columnCount = 0;

		Integer intArray[][] = { { 3, 914 }, { 62, 24 }, { 52, 34 }, { 542, 44 } };

//		System.out.println(Arrays.deepToString(intArray));

		for (Integer[] loopArray : intArray) {
			for (Integer findMax : loopArray) {
				if (findMax > max) {
					max = findMax;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (intArray[i][j] == max) {
					rowCount = i;
					columnCount = j;
				}
			}
		}
		System.out.println("Max value is " + max + "\nPosition in array is [" + rowCount + ", " + columnCount + "]");

	}

}
