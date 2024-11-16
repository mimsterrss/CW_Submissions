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
		
		System.out.println(Tracey.indexOf('e')); 
		
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
 * @param "computer" 
 */
	
	public static void firstAndLastThree(String computer) {
		
		System.out.print("The first three letters are " + computer.substring(0,3));
		System.out.print(" and the last three letters are " + computer.substring(computer.length()-3) + ".");
		
	}

}
