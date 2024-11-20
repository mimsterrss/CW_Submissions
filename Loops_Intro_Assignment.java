/*
 * This is my Loops Intro Assignment, created on Wednesday, November 20th, 2024
 * Our tasks are to 1) Create a method countLetters() that is passed a String and a char and returns how many times that passed 
 * char shows up in the passed String. 2) Create a method getFactorial() that is passed an int and returns the factorial of 
 * that int (a factorial is a number multiplied by each number before it. And lastly, 3) Create a method getIfRepeats() that will
 * return true if the passed String has two of the same letter next to each other, and prints false if not.
 */

public class Loops_Intro_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t = "abqcdqefghqqijk";
		char x = 'q';
		
		System.out.println(countLetters(t, x));
		System.out.println(getFactorial(5));
		System.out.println(getIfRepeats("mimii"));
		
	}
	
	// question 1
		/**
		 * This method is used to tell us how many times the same character is used in the string 
		 * @param str
		 * @param let
		 * @return countLetters
		 */
	
		public static int countLetters(String str, char let){
			
			int count=0;
			for(int i=0; i<str.length(); i++)
			{
				if(let==str.charAt(i))
				{
					count++;
				}

			}
		
			return count;
	
		}
		
	// question 2
		/**
		 * This method is used to to show us the factorial of an int
		 * param @num
		 * @return factorial 
		*/
		
		public static int getFactorial(int num) {
			
			for (int i=num-1; i>0; i=i-1)
			{
				num=num * i;
			}
			return num;
		}

		
	//question 3
		/**
		 * This method will return true if the passed String has two of the same letter next to each other, and prints false if not.
		 * param @str
		 * @return getIfRepeat
		 */
	
		public static Boolean getIfRepeats(String str) {
			
			for (int i=0; i<str.length()-1; i++)
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					return true;
				}
				
			}
				
			return false;
		}
		

}
