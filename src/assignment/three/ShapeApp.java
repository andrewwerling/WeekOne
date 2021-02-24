/**
 * 
 */
package assignment.three;

/**
 * @author andrewwerling
 *
 */
public class ShapeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(3, 5);
		System.out.println("Triangle");
		triangle.calculateArea();
		triangle.display();
		
		Circle circle = new Circle(5);
		System.out.println("\nCircle");
		circle.calculateArea();
		circle.display();
		
		Rectangle rectangle = new Rectangle(9, 20);
		System.out.println("\nRectangle");
		rectangle.calculateArea();
		rectangle.display();

	}

}
