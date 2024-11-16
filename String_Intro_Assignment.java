/*
* This is my String Intro Assignment. The five tasks were listed as the following:
* 1) In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. Be sure to close the scanner at the bottom of 
* your main method before testing any code. 2) Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String.
* 3) Make and test a method findTheEthat returns the index of the first 'e' character in a passed String. 4) Make and test a method getLength that returns the amount of characters 
* (the length) of a passed String. 5) Make and test a void method printFirstAndLastThree that is passed a string and prints the first three and last three characters in a passed String.
*/
import java.util.Scanner;

public class String_Into_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//my scanner--will read and allows the user to typed in the console
		Scanner myReader = new Scanner(System.in);
		String myWord = new String(myReader.next());
		
		myReader.close();
		
		printSecondAndLastLetter(myWord);
		findTheE(myWord);
		getLength(myWord);
		firstAndLastThree(myWord);
		

	}

//Task 2
/** 
 * This void method will print the second and last letter in the passed string
 * @param heart
 */

	public static void printSecondAndLastLetter(String heart){
		
		System.out.println("The second letter is " + heart.charAt(1) + " and the last letter is " + heart.charAt(heart.length()-1) + ".");
	
	}
	
//Task 3
/**
 * This method will return the index of the first 'e' character in a passed string
 * @param Tracey
 */
	
	public static void findTheE(String Tracey) {
		
		System.out.println("The first e occurs at index " + Tracey.indexOf('e') + "."); 
		
	}
	
//Task 4
/** 
 * This method returns the amount of characters in (the length) of a passed String
 * @param Manae
 */
	
	public static int getLength(String Manae) {
		
		System.out.println("The length is " + Manae.substring(Manae.length()));
		return Manae.length();
		
	}
	
//Task 5
/** 
 * This void method that is passed a string and prints the first three and last three characters in a passed String
 * @param "creatures" 
 */
	
	public static void firstAndLastThree(String creatures) {
		
		System.out.print("The first three letters are " + creatures.substring(0,3));
		System.out.print(" and the last three letters are " + creatures.substring(creatures.length()-3) + ".");
		
	}

}
