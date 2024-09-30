/* Today is Wednesday, September 25th. My name is Mimi Hall and this class is used to help us learn 
* how to make a Circle class withOUT using the main method. It declares the data attributes, functionality, and the formulas
* for each formula of a circle. This includes the radius, diameter, area, and circumference. Going back into the main method,
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
	/** This method will return a radius 
	 * @return the radius */
	public double getRadius()
	{
		return radius;
	}
	
	/** This method will return a diameter 
	 * @return the diameter */
	public double getDiameter()
	{
		return radius+radius;
	}
	
	/** This method will return the circumference 
	 * @return the circumference */
	public double getCircumference()
	{
		return 2*pi*radius;
	}
	
	/** This method will return the area 
	 * @return the area */
	public double getArea()
	{
		return pi*(radius*radius);
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	
	/** This method will return the name of the shape 
	 * @return the name of shape */
	public static String getShape()
	{
		return "Circle";
	}
	
	/**
	 * This turns everything about the circle into a String
	 */
	public String toString()
	{
		return "This is a Circle with a radius of " + radius + " and an area of " + getArea() + 
				" and a circumference of " + getCircumference() + ".";
	}

}
