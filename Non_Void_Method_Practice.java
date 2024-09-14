/* My name is Mimi Hall, today is September 13, 2024, and in this class, we learn the non void method. 
 * My tasks were to complete the same tasks as the Methods introduction practice, but instead of 
 * public void it is a non void method. My tasks were to first, declare my name, hair style, and 
 * favorite food. My second task is to create a method called printCircleStats() that is passed a 
 * double (meant to represent a circle's radius) and calculates then prints out the radius, diameter,
 * circumference, and area of the circle. My third and final task is to Create a method printMathStuffs()
 * that is passed two ints and prints their sum, difference, product, quotient, and the remainder 
 * (using modulus) of the first number modulus the second number. */

public class Non_Void_Method_Practice {

	public static void main(String[] args) {
	
	//TASK 1
	System.out.print(stateName());
	System.out.print(stateEyeColor());
	System.out.println(stateFavoriteFood());
	
	//TASK 2 (diameter, circumference, area)
	final double pi = 3.14;
	double radi = 8.0;
	double diam = calcDiameter(radi);
	double circum = calcCircumference(radi, pi);
	double area = calcArea(radi, pi);
	
	//print radius
	System.out.print("The radius is " + radi);
	System.out.print(", ");
	
	//print diameter
	System.out.print("the diameter is " + diam);
	System.out.print(", ");
	
	//print circumference
	System.out.print("the circumference is " + circum);
	System.out.print(", ");
	
	//print area
	System.out.print("and the area is " + area);
	System.out.println(".");
	
	//TASK 3
	int x = 2;
	int y = 3;
	double sum = calcSum(x, y);
	double diff = calcDifference(x, y);
	double prod = calcProduct(x, y);
	double quot = calcQuotient(x, y);
	double rema = calcRemainder(x, y);
	
	//print sum
	System.out.print("The sum of the two ints is " + sum);
	System.out.print(", ");
	
	//print difference
	System.out.print("the difference is " + diff);
	System.out.print(", ");
	
	//print product
	System.out.print("the product is " + prod);
	System.out.print(", ");
	
	//print quotient
	System.out.print("the quotient is " + quot);
	System.out.print(", ");
		
	//print remainder
	System.out.print("and the remainder is " + rema);
	System.out.print(". ");
		
	}
	
	//TASK 1
	public static String stateName()
	{
		return "My name is Mimi Hall. ";
	}
	
	public static String stateEyeColor()
	{
		return "My eye color is dark brown. ";
	}

	public static String stateHairstyle()
	{
		return "My hairstyle is in a claw clip. ";
	}
	
	public static String stateBestFriend()
	{
		return "My best friend is Lacey Manzano. ";
	}
	
	public static String stateFavoriteFood()
	{
		return "My favorite food is anything from McDonald's. ";
	}
	
	//TASK 2
	public static double calcDiameter(double radi)
	{
		return (radi+radi);
	}
	
	public static double calcCircumference(double radi, final double pi)
	{
		return (2*pi*radi);
	}
	
	public static double calcArea(double radi, final double pi)
	{
		return (pi*(radi*radi));
	}
	
	//TASK 3
	public static double calcSum(int x, int y)
	{
		return (x+y);
	}
	
	public static double calcDifference(int x, int y)
	{
		return (x-y);
	}
	
	public static double calcProduct(int x, int y)
	{
		return (x*y);
	}
	
	public static double calcQuotient(int x, int y)
	{
		return (x/y);
	}
	
	public static double calcRemainder(int x, int y)
	{
		return (x%y);
	}
	
}
	
