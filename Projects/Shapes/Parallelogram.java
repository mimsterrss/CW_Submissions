
public class Parallelogram {

	//data attributes
		private double base;
		public void setBase(double base) {
			this.base = base;
		}


		public void setHeight(double height) {
			this.height = height;
		}


		public void setSide(double side) {
			this.side = side;
		}

		private double height;
		private double side;
			
		//constructor
		public Parallelogram (double b, double h, double s)
		{
			base = b;
			height = h;
			side = s;
			
		}

		
		//functionality
		/** This method will return a base of the parallelogram
		 * @return the base */
		public double getBase()
		{
			return base;
		}
		
		/** This method will return a height of the parallelogram
		 * @return the height */
		public double getHeight()
		{
			return height;
		}
		
		/** This method will return a side of the parallelogram
		 * @return the side */
		public double getSide()
		{
			return side;
		}
		
		/** This method will return the area of the parallelogram
		 * @return the area */
		public double getArea()
		{
			return (base*height);
		}
		
		/** This method will return the perimeter of the parallelogram
		 * @return the perimeter */
		public double getPerimeter()
		{
			return (base+base+side+side);
		}
		
		/** This method will return the name of the shape
		 * @return the name of the shape */
		public static String getShape()
		{
			return "Parallelogram";
		}	
	
}
