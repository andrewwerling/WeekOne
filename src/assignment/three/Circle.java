/**
 * 
 */
package assignment.three;

/**
 * @author andrewwerling
 *
 */
public class Circle implements Shape {

	Double radius;
	Double area;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	@Override
	public void display() {
		
		System.out.println("Area = " + this.area + "\nRadius = " + this.radius);
		
	}

	@Override
	public double calculateArea() {
		
		this.area = Math.pow(this.radius, 2)* Math.PI;
		
		return this.area;
	}

}
