/**
* This class is my main for my MYC Game. FOr this final project, I decided to do an Escape the Night (Tree house edition). This project includes a while loop, for loop, 
* if else statements, and setters and getters. All of these main ideas are used to complete my game and enhance the game giving the players a bigger variety content and choices.
**/

import java.util.Scanner; 

public class Main {
	
	//this opens a scanner
			static Scanner myReader = new Scanner (System.in);

	public static void main(String[] args) {
		
		welcomeToGame();		
		buildingCharacter();
		phases();
		
		//closes reader
		myReader.close();
		
	}
	

	public static void welcomeToGame() {
		
		//welcoming them into the game & collecting their names before the first phase of the game
		System.out.println("Welcome to Escape the Night! In this game, you will be attempting to escape overnight, locked in a treehouse.");
		System.out.println("");
		
		//laying out the basic rules to survive the game
		//if they fail any of these rules, the user loses the game
		System.out.println("However, there are rules that are essential to survivng:");
		System.out.println("1. Don’t turn on the lamp, it will wake the animals.");
		System.out.println("2. The number 3 is very unlucky.");
		System.out.println("3. Don’t open the Book of Secrets.");
		System.out.println("");
				
		System.out.println("Please type 'ready' to start the game.");
		boolean test = true;
		String input = myReader.nextLine();
			
		while (test) {
				
				if (input.equals("ready")) {
					
					test = false;
				}
				else{
					
					test = true;
					System.out.print("Please type 'ready'.");
					input = myReader.nextLine();
					
				}
				
			}
		
	}
	
	public static void buildingCharacter() {
		
		//first setter, inputting their name using userInput
			System.out.println("Please type your name here: ");
				
			String userInput = new String(myReader.next());
			System.out.println("");
				
				
			System.out.println("Wake up " + userInput + "!");
		
	}
	
	public static void phases() {
	
		System.out.println("You hear a voice in your dream and wake up. It's dark and you have no idea where you are.");
		System.out.println("You look out the window and you realize you are hanging in tree in the middle of the jungle. You need to find a way to escape.");
		System.out.println("");
		
		//first choice
		//if they choose the lamp, they wake up the animals and a tiger will lose the game (animals swarm the tree house and suffocate them.
		//if they choose the flashlight, they continue through the game.
		System.out.println("You need a source of light. You spot a lamp (1) or flashlight (2), which do you choose?");
		
		//opening scanner
			String userSelection = myReader.next();
		
		if (userSelection.equals("one") || userSelection.equals("1")){
			
			//lost game
			System.out.println("You broke rule #1. You woke the animals and they storm into the treehouse, you get suffocated and have no way escape.");;
			System.out.print("You have lost the game.");
			
		}
		else if (userSelection.equals("two") || userSelection.equals("2")){
			
			System.out.println("");
			System.out.println("You scout out the tree house, looking for ways to escape.");
			firstPhase();
	
		}
	}
	
	public static void firstPhase() {
		
		System.out.println("You spot a book lying in front of you. There's a lock on it.");
		System.out.println("Please choose a number 1-5 to unlock the book. From there, you will recieve a "
				+ "name that you will now go by from now on.");
		System.out.println("Type the number here: ");
		System.out.println("");
		
		//this is a string that declares months with all the 12 months within a year
		
		String userSelection = myReader.next();
		if (userSelection.equals("one") || userSelection.equals("1")) {
			
			System.out.println("Your new name is Jordan.");
			System.out.println("");
			secondPhase();
			
		}
		else if (userSelection.equals("two") || userSelection.equals("2")) {
			
			System.out.println("Your new name is Alyx.");
			System.out.println("");
			secondPhase();
			
		}
		else if (userSelection.equals("three") || userSelection.equals("3")) {
		
			System.out.println("You get no name. You broke rule #2. You spoke of the unlucky number 3. The book shook the whole treehouse and consumed you whole. You lost the game.");
			
		}
		else if (userSelection.equals("four") || userSelection.equals("4")) {
			
			System.out.println("Your new name is Riley.");
			System.out.println("");
			secondPhase();
			
		}
		else if (userSelection.equals("five") || userSelection.equals("5")) {
			
			System.out.println("Your new name is Tatum.");
			System.out.println("");
			secondPhase();
			
		}
	}
	
	public static void secondPhase() {
		
		System.out.println("The book starts shaking. You read the title and realize it's the Book of Secrets.");
		System.out.println("The backing reads 'Directions on how to escape'. Will you open it? Please type yes or no below.");
		
		String userSelection = myReader.next();
		
		if (userSelection.equals("yes") || userSelection.equals("Yes")) {
			
			System.out.print("You broke rule #3. You opened the Book of Secrets and it consumed you as a whole. You lost the game.");
			
		}
		else if (userSelection.equals("no") || userSelection.equals("No")) {
			
			System.out.println("You quickly close it remembering rule #3. You continue to explore the tree house.");
			thirdPhase();
			
		}
		
	}
	
	public static void thirdPhase() {
		
		System.out.println("You get blinded by a bright light, you begin to walk towards it. Suddenly, you feel the treehouse shaking.");
		System.out.println("You wake up to the bright light and wake up, It was a dream all along. You try to go back to sleep to finish the game.");
		System.out.println("");
		System.out.println("Part 2 coming soon.");
	}
	
}
