/**
 * This is my Monty hall project. Monty Hall is a guessing game in which the player is prompted to select one 
 * of three doors. One of the  doors has a prize behind it, while the other two doors holds nothing. 
 * Once the user selects a door, one of the other two doors is revealed that has nothing behind it. Then 
 * the player is asked if they would like to switch to a different door. Once they choose to stay or switch,
 * they are finally told whether or not they have won the game. 
 */


import java.util.Scanner;
//scanner

public class MontyHall {

	//this opens a scanner
	static Scanner myReader = new Scanner (System.in);
	
	//this assigns ints into methods
	public static void main(String[] args) {
		
		int winDoor = pickRandomDoor();
		int playerDoor = pickPlayerDoor();
		int wrongDoor = showWrongDoor(playerDoor, winDoor);
		
		System.out.println(wrongDoor);
		askToSwitch(winDoor, playerDoor);

	}

	//this will randomly choose a door between 1-3
	public static int pickRandomDoor()
	{
		
		return ((int)(Math.random()*3)+1);
		
	}
	
	//this will ask the player which door they want to choose. 
	public static int pickPlayerDoor()
	{
		
		System.out.print("Please select a door number from 1-3:");
		
		String userSelection = myReader.next();
		
		if (userSelection.equals("one") || userSelection.equals("1"))
		{
			return 1;
		}
		else if (userSelection.equals("two") || userSelection.equals("2"))
		{
			return 2;
		}
		else if (userSelection.equals("three") || userSelection.equals("3"))
		{
			return 3;
		}
		else
		{
			System.out.print("Try again!");
			return 0;
		}
	}
	
	/** 
	 * this method will show the play which door is wrong
	 * @param playerDoor
	 * @param winDoor
	 * @return
	 */
	public static int showWrongDoor(int playerDoor, int winDoor){
		
		int choose = ((int)(Math.random()*2));
		
		//if the player chooses the wrong door instead of win door
		if (playerDoor==1  && winDoor==2)
		{
			return 3;
		}
		if (playerDoor==1 && winDoor==3)
		{
			return 2;
		}
		if (playerDoor==2 && winDoor==1)
		{
			return 3;
		}
		if (playerDoor==2 && winDoor==3)
		{
			return 1;
		}
		if (playerDoor==3 && winDoor==1)
		{
			return 2;
		}
		if (playerDoor==3 && winDoor==2)
		{
			return 1;
		}
		
		//puts into system that the wrong door is 1
		if (playerDoor==1 && winDoor==1){
			
			return ((int)(Math.random()*2)+2);	
		}
		
		//puts into system that the wrong door is 2
		if (playerDoor==2 && winDoor==2){
			
			if (choose==0) {
				return 1;
			}
			else{
				
				return 3;
				
			}
		}
		
		//puts into system that the wrong door is 3
		if (playerDoor==3 && winDoor==3) {
			
			return ((int)(Math.random()*2)+1);
			
		}	
		return 0;
		
	}
	
/**
 * This method will ask the player if they want to switch the door they chose or to keep it
 * Depending on their choice, it will tell them whether they have won or lost the game
 * @param winDoor
 * @param playerDoor
 */
	public static void askToSwitch(int winDoor, int playerDoor) {
		
		System.out.print("Would you like to switch doors?");
		
		String userInput = new String(myReader.next());
		
		if(userInput.equals("yes") && winDoor==playerDoor) {
			
			System.out.print("Sorry, you lose :(");
		
		}
		else if(userInput.equals("yes") && winDoor!=playerDoor) {
			
			System.out.print("Congrats, you won! :)");
			
		}
		else if(userInput.equals("no") && winDoor==playerDoor) {
			
			System.out.print("Congrats, you won! :)");
			
		}
		else if(userInput.equals("no") && winDoor!=playerDoor) {
			
			System.out.print("Sorry, you lose :(");
			
		}
		
		
	}
	
}
