
public class Square {

	//data attributes
	private double side;
		
	//constructor
	public Square (double s)
	{
		side = s;
	}

	
	//functionality
	/** This method will return a side of the square 
	 * @return the side */
	public double getSide()
	{
		return side;
	}
	
	/** This method will return the area of the square
	 * @return the area */
	public double getArea()
	{
		return side*side;
	}
	
	/** This method will return the perimeter of the square
	 * @return the perimeter */
	public double getPerimeter()
	{
		return 4*side;
	}

		
}
