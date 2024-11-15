/*
 * Today is November 15th, 2024 and this is my Logic Quiz corrections. I included the main method
 * to test if the code prints correctly. The directions for this quiz is to write code that would replace 
 * the comment and accomplishes the goal of the method correctly. The prompt was: "A year is considered a 
 * leap year if the year is divisible by 4. However, if the year is also divisible by 100, then it is only 
 * a leap year if it is also divisible by 400. Observe the following method which is supposed to return 
 * whether or not a given variable year is a leap year:

public static boolean findIfIsLeapYear( int year )

{

     Implementation not shown

}
 
 */


public class Test_Corrections {

	public static void main(String[] args) {
		
		/** 
		 * testing if the code with run with 8 as a leap year
		 */
		System.out.print(findIfIsLeapYear(8));

	}

	public static boolean findIfIsLeapYear(int year)
	{
		
		{
		/** 
		 * will check if the leap year is divisible by 4, if it can, then you will check if it is divisble by 400.
		 * if not, like the number 8, it will still be true if divisible by 4 as a leap year. If not, it will return false. 
		 */
		if (year%4==0)
		{
			if (year%400==0) 
			{
				return true;
			}
			else if (year%100!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
		}
	}
	
