/*
* This is my Wordle game (project) that is made on November 6th for my AP Computer Science Class. This game
* works by the player guessing different five-letter words to solve which five-letter word the computer has
* generated. It will tell the player if the word is too short or too long, if there's a repeating letter,
* if certain letters are in the right place, wrong place, or not used in that five-letter word. Once the 
* player guesses the word correctly, they win the game. 
*/

import java.util.Scanner;
public class WordleGame {
	
	static Scanner gameReader = new Scanner (System.in);

	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String soln = new String ("ocean");
		
		System.out.print("Welcome to Wordle! Please type any 5-letter word to solve the puzzle.");
		
		//run the game
		playGame(soln);
		
		playerGuess(soln);
		
		
	}

	/**
	 * @param soln is the right answer
	 */
	private static void playGame(String soln) {
		
		//create a scanner object that is constructed to read the console (aka System.in)
		
		
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase please): ");
		
		
	}
	
	private static String possibleErrors()
	{
		String guess = new String (gameReader.next());
		
		/*
		 * checks if the word that the player typed is not under or over 5 letters long,
		 * along with the word not having a repeating letter in it.
		 */
		if (guess.length()!=5)
		{
			System.out.print("Make sure the word is 5 letters long.");
		}
		else if (guess.charAt(0) == guess.charAt(1) || guess.charAt(0) == guess.charAt(2) || guess.charAt(0) == guess.charAt(3) || guess.charAt(0) == guess.charAt(4))
		{
			System.out.print("That word has repeating letter, try again.");
		}
		else if (guess.charAt(1) == guess.charAt(2) || guess.charAt(1) == guess.charAt(3) || guess.charAt(1) == guess.charAt(4))
		{
			System.out.print("That word has repeating letter, try again.");
		}
		else if (guess.charAt(2) == guess.charAt(3) || guess.charAt(2) == guess.charAt(4))
		{
			System.out.print("That word has repeating letter, try again.");
		}
		else if (guess.charAt(3) == guess.charAt(4))
		{
			System.out.print("That word has repeating letter, try again.");
		}
		return guess;
	}
	
	private static void playerGuess(String soln)
	{
		String guessTwo = possibleErrors();
		
		/*
		 * begins to check each letter of the word to tell player if the letters are correct, in
		 * the wrong spot, or if the letter is not used in the five-letter word.
		 * checks the first letter of the five-letter word
		 */
		if (guessTwo.charAt(0) == soln.charAt(0))
		{
			System.out.print(soln.charAt(0));
		}
		else if (guessTwo.charAt(0) == soln.charAt(1) || guessTwo.charAt(0) == soln.charAt(2) || guessTwo.charAt(0) == soln.charAt(3) || guessTwo.charAt(0) == soln.charAt(4))
		{
			System.out.print("?");
		}
		else if (guessTwo.charAt(0) != soln.charAt(0))
		{
			System.out.print("X");
		}
		
		/*
		 * checks the second letter of the five-letter word
		 */
		if (guessTwo.charAt(1) == soln.charAt(1))
		{
			System.out.print(soln.charAt(1));
		}
		else if (guessTwo.charAt(1) == soln.charAt(0) || guessTwo.charAt(1) == soln.charAt(2) || guessTwo.charAt(1) == soln.charAt(3) || guessTwo.charAt(1) == soln.charAt(4))
		{
			System.out.print("?");
		}
		else if (guessTwo.charAt(1) != soln.charAt(1))
		{
			System.out.print("X");
		}
		
		/*
		 * checks the third letter of the five-letter word
		 */
		if (guessTwo.charAt(2) == soln.charAt(2))
		{
			System.out.print(soln.charAt(2));
		}
		else if (guessTwo.charAt(2) == soln.charAt(0) || guessTwo.charAt(2) == soln.charAt(1) || guessTwo.charAt(2) == soln.charAt(3) || guessTwo.charAt(1) == soln.charAt(4))
		{
			System.out.print("?");
		}
		else if (guessTwo.charAt(2) != soln.charAt(2))
		{
			System.out.print("X");
		}
		
		/*
		 * checks the fourth letter of the five-letter word
		 */
		if (guessTwo.charAt(3) == soln.charAt(3))
		{
			System.out.print(soln.charAt(3));
		}
		else if (guessTwo.charAt(3) == soln.charAt(0) || guessTwo.charAt(3) == soln.charAt(1) || guessTwo.charAt(3) == soln.charAt(2) || guessTwo.charAt(3) == soln.charAt(4))
		{
			System.out.print("?");
		}
		else if (guessTwo.charAt(2) != soln.charAt(3))
		{
			System.out.print("X");
		}
			
		/*
		 * checks the fifth letter of the five-letter word
		 */
		if (guessTwo.charAt(4) == soln.charAt(4))
		{
			System.out.print(soln.charAt(4));
		}
		else if (guessTwo.charAt(4) == soln.charAt(0) || guessTwo.charAt(4) == soln.charAt(1) || guessTwo.charAt(4) == soln.charAt(2) || guessTwo.charAt(4) == soln.charAt(3))
		{
			System.out.print("?");
		}
		else if (guessTwo.charAt(2) != soln.charAt(2))
		{
			System.out.print("X");
		}
		
		/*
		 * tells player if they have won the game and guessed the correct word
		 */
		if (guessTwo.charAt(0) == soln.charAt(0) && guessTwo.charAt(1) == soln.charAt(1) && guessTwo.charAt(2) == soln.charAt(2) && guessTwo.charAt(3) == soln.charAt(3) && guessTwo.charAt(4) == soln.charAt(4))
		{
			System.out.println("  Congratulations, you have won the game!");
		}
		else
		{
			playerGuess(soln);
		}
	
	}
	

}
