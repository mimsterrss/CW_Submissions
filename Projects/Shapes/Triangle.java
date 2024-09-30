
public class Triangle {
	//data attributes
	private double base;
	private double height;
	private double side;
		
	//constructor
	public Triangle (double b, double h, double s)
	{
		base = b;
		height = h;
		side = s;
		
	}

	
	//functionality
	/** This method will return an edge of the triangle 
	 * @return the edge */
	public double getBase()
	{
		return base;
	}
	
	/** This method will return the height of the triangle 
	 * @return the height */
	public double getHeight()
	{
		return height;
	}
	
	/** This method will return the area of the triangle
	 * @return the area */
	public double getArea()
	{
		return (0.5*(base*height));
	}
	
	/** This method will return the perimeter of the triangle
	 * @return the perimeter */
	public double getPerimeter()
	{
		return (base+height+side);
	}
	
	/** This method will return the name of the shape
	 * @return the name of the shape */
	public static String getShape()
	{
		return "Triangle";
	}	


}
