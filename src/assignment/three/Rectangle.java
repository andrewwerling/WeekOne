/**
 * 
 */
package assignment.three;

/**
 * @author andrewwerling
 *
 */
public class Rectangle implements Shape {

	Double length;
	Double width;
	Double area;
	
	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
		
	}
	
	@Override
	public void display() {
		
		System.out.println("Area = " + this.area + "\nWidth = " + this.width + "\nLength = " + this.length);
		
	}

	@Override
	public double calculateArea() {
		
		this.area = this.length * this.width;
		
		return this.area;
	}

}
