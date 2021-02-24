/**
 * 
 */
package assignment.three;

/**
 * @author andrewwerling
 *
 */
public class Triangle implements Shape {
	Double base;
	Double height;
	Double area = 0.0;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		
		this.area = (.5)*(this.base * this.height);
		
		return this.area;
	}

	@Override
	public void display() {
		
		System.out.println("Area = " + this.area + "\nBase = " + this.base + "\nHeight = " + this.height);
		
	}

}
