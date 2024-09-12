/* My name is Mimi Hall, today is September 11, 2024, and in this class I practice void methods.
 * My first task is to declare my name, hair style, and favorite food. My second task is to 
 * create a method called printCircleStats() that is passed a double (meant to represent a circle's 
 * radius) and calculates then prints out the radius, diameter, circumference, and area of the circle.
 * My third and final task is to Create a method printMathStuffs() that is passed two ints and prints 
 * their sum, difference, product, quotient, and the remainder (using modulus) of the first number 
 * modulus the second number. */


public class Methods_Intro_Practice {

	public static void main(String[] args) {

		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(2.0);
		printMathStuffs(5, 6);
		
		
	}

	public static void stateName()
	{
	System.out.print("My name is Mimi Hall.");
	}
	
	public static void stateEyeColor()
	{
	System.out.print("My eye color is straight in a ponytail.");
	}
	
	public static void stateHairStyle()
	{
	System.out.print(" My hair style is straight in a ponytail.");
	}
	
	public static void stateBestFriend()
	{
	System.out.print(" My bestfriend is Lacey Manzano.");
	}
	
	public static void stateFavoriteFood()
	{
	System.out.println(" My favorite food is anything from McDonald's.");
	}
	
	public static void printCircleStats(double radius)
	{
	//declare the parts of the circle
	final double pi = 3.14;
	double diameter = radius+radius;
	double circum = 2*pi*radius;
	double area = pi*(radius*radius);
	
	//printing circle's radius
	System.out.print("The circle's radius is ");
	System.out.print(radius);
	System.out.print(". ");
	
	//printing circle's diameter
	System.out.print("It's diameter is ");
	System.out.print(diameter);
	System.out.print(". ");
	
	//printing circle's circumference
	System.out.print("The circumference is ");
	System.out.print(circum);
	System.out.print(". ");
	
	//printing circle's area
	System.out.print("Finally, the area is ");
	System.out.print(area);
	System.out.println(". ");
		
	}
	
	public static void printMathStuffs(int x, int y)
	{
	
	//print int's sum
	System.out.print("The sum of the two ints is ");
	System.out.print(x+y);
	System.out.println(". ");
	
	//print int's difference
	System.out.print("The difference of the two ints is ");
	System.out.print(x-y);
	System.out.println(". ");
	
	//print int's product
	System.out.print("The product of the two ints is ");
	System.out.print(x*y);
	System.out.println(". ");
	
	//print quotient
	System.out.print("The quotient of the two ints is ");
	System.out.print(x/y);
	System.out.println(". ");
	
	//print quotient
	System.out.print("The remainder of the two ints is ");
	System.out.print(x%y);
	System.out.println(". ");
		
	}
	
	
}
