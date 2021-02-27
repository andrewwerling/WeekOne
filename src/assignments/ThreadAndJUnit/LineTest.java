/**
 * 
 */
package assignments.ThreadAndJUnit;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author andrewwerling
 *
 */
public class LineTest {

	Line testLineOne = new Line(.0001, .0002, .0003, .0004);
	Line testLineTwo = new Line(.001, .002, .003, .004);
	Line testLineThree = new Line(.01, .02, .03, .04);
	Line testLineFour = new Line(.1, .2, .3, .4);
	Line testLineFive = new Line(1.0, 2.0, 3.0, 4.0);
	Line testLineSix = new Line(1.0, 2.0, 3.0, 4.0);
	Line testLineSeven = new Line(5.0, 10.0, 10.0, 5.0);


	/**
	 * Test method for {@link assignments.ThreadAndJUnit.Line#getSlope()}.
	 */
	@Test
	public void testGetSlope() {
		assertEquals(1, testLineOne.getSlope(), .0001);
		assertEquals(1, testLineTwo.getSlope(), .0001);
		assertEquals(1, testLineThree.getSlope(), .0001);
		assertEquals(1, testLineFour.getSlope(), .0001);
		assertEquals(1, testLineFive.getSlope(), .0001);
	}

	/**
	 * Test method for {@link assignments.ThreadAndJUnit.Line#getDistance()}.
	 */
	@Test
	public void testGetDistance() {
		assertEquals(2.828427, testLineSix.getDistance(), .0001);
		assertEquals(7.071068, testLineSeven.getDistance(), .0001);
	}

	/**
	 * Test method for {@link assignments.ThreadAndJUnit.Line#parallelTo(assignments.ThreadAndJUnit.Line)}.
	 */
	@Test
	public void testParallelTo() {
		assertTrue(testLineFive.parallelTo(testLineSix));
		assertFalse(testLineSix.parallelTo(testLineSeven));
	}

}
