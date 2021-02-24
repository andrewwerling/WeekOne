/**
 * 
 */
package assignment.three;

/**
 * @author andrewwerling
 *
 */
public interface Shape {
	
	public Double area = null;

	public void display();

	/**
	 * @param base
	 * @param height
	 * @return
	 */
	double calculateArea();
}
