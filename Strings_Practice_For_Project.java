
/*
 * This assignment is Strings Practice for our upcoming project, a Make Your Choice Game. We were given two tasks.
 * 
 * First, Create a while loop that prompts the user to input text into the console, and then the console prints out 
 * what they inputted and a number representing how many times the loop has run. Unless the player types "stop" in 
 * which case the loop should end.
 * 
 * Second,  Use your previously created shapes classes to complete the following task: Choose one of the shape o
 * bjects you created, for example Circle1. Make a for loop that will run 5 times. Each time, the user should be 
 * prompted to input a double. Then, the double should be added to one of the object's attributes. After the loop 
 * is done, print the shape's original attribute value and its final attribute value. 
 */

import java.util.Scanner;

public class Strings_Practice_For_Project {

	static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		taskOne();
		taskTwo();
		
	}
	
		//task one
		public static void taskOne() {
			
			boolean match = true;
			int count = 0;
			
			while (match) {
				
				String userInput = new String(myReader.next());
				
				if (userInput.equals("stop")) {
					
					match = false;
				}
				count++;
				System.out.print(count + userInput);
				
			}
			
		}
		
		//task two
		public static void taskTwo() {
			
			//using Circle 1 to get and set the new radius of the circle using what the player wants to 
			//set it as (userInput)
			Circle circ1 = new Circle(3.0);
			System.out.print("The radius of Circle 1 is " + circ1.getRadius());
			
			for (int i=1; i<=5; i++) {
				
				double userInput = myReader.nextDouble();
				System.out.print(circ1.getRadius() + userInput);
				circ1.setRadius(circ1.getRadius() + userInput);
				
			}
			
		}

}
