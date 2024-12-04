
public class Loops_Annotation {
		
		/* This code will take a number you chose ('n'), between numbers 1-12, and will print 
		 * out just that month or that month with all the months following until December
		*/
		public static String getMonth(int n)
			{
				//this is a string that declares months with all the 12 months within a year
				String months = "January February March April May June "
						+ "July August September October November December ";

			//this (for) loop will take the string and run it through the loop
			//int i is equal to 1; as long as your i is less than or equal to 12 the loop will run; once run through, i will go up by 1. 
				for (int i = 1; i <= 12; i++)
				{
					// this int uses the space location to eliminate a month at a time
					//sL stands for "space location"
					int sL = months.indexOf(' ');

		      //this is an if statement that if true, will run and ignore the else statement
					//n is any number you declare it to be from 1-12, once i and n equals to each other, it will return what inside the if statement.
					if (n == i)
					{
		        //if true, it will return the month that your int is at 
						return months.substring(0, sL);
					}
		      //this is an else statement, if the if statement is false, it will run the else statement instead.
					else
					{
		        //this will return the month your int is at and the remainder of the string
						months = months.substring(sL + 1);
					}
				}
				//this is return statement is to declare that is an error and the user that it's unavailable and take them back to the beginning
				return " /* What String would you put here? */ ";
				
			}

	}
