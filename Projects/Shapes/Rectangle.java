
public class Rectangle {
	//data attributes
	private double length;
	private double width;
		
		//constructor
		public Rectangle (double l, double w)
		{
			length = l;
			width = w;
		}
		
		
		//functionality
		/** This method will return a length of the rectangle
		 * @return the length */
		public double getLength()
		{
			return length;
		}
		
		/** This method will return a width of the rectangle
		 * @return the width */
		public double getWidth()
		{
			return width;
		}
		
		/** This method will return the area of the rectangle
		 * @return the area */
		public double getArea()
		{
			return (length*width);
		}
		
		/** This method will return a perimeter of the rectangle
		 * @return the perimeter */
		public double getPerimeter()
		{
			return 2*(length*width);
		}
		
		/** This method will return the name of the shape
		 * @return the name of the shape */
		public static String getShape()
		{
			return "Rectangle";
		}
		
}
