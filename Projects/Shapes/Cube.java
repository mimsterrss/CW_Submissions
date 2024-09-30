public class Cube {
	//data attributes
			private double edge;
				
			//constructor
			public Cube (double e)
			{
				edge = e;
				
			}

			
			//functionality
			/** This method will return an edge of the cube
			 * @return the edge */
			public double getEdge()
			{
				return edge;
			}
			
			/** This method will return the volume of the cube
			 * @return the volume */
			public double getVolume()
			{
				return (edge*edge*edge);
			}
			
			/** This method will return the perimeter of the cube
			 * @return the perimeter */
			public double getPerimeter()
			{
				return 12*edge;
			}
			
			/** This method will return the surface area of the cube
			 * @return the surface area */
			public double getSurfaceArea()
			{
				return 6*(edge*edge);
			}
			
			/** This method will return the name of the shape
			 * @return the name of the shape */
			public static String getShape()
			{
				return "Cube";
			}	
}
