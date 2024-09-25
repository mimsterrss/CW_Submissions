/* Today is Wednesday, September 25th. My name is Mimi Hall and this class is used to help us learn 
* how to make a Circle class withOUT using the main method. It declares the data attributes, functionality, and the formulas
* for each forumla of a circle. This includes the radius, diameter, area, and circumference. Going back into the main method,
* you are able to print out the methods without having to type out the formula within the main method. 
*/

public class Circle {
	//data attributes
	private final double pi = 3.14;
	private double radius;
	
	//constructor
	public Circle (double r)
	{
		radius = r;
		
	}
	
	//functionality
	
	//declare radius
	public double getRadius()
	{
		return radius;
	}
	
	//formula for diameter
	public double getDiameter()
	{
		return radius+radius;
	}
	
	//formula for circumference
	public double getCircumference()
	{
		return 2*pi*radius;
	}
	
	//formula for area
	public double getArea()
	{
		return pi*(radius*radius);
	}
	
	//declare the name of the class
	public static String getShape()
	{
		return "Circle";
	}

}
