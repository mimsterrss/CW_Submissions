import java.util.Scanner;

/**
 * This is my invisible maze game. This game is to avoid bombs and reach the target spot. 
 * I hate this project. Please give me an A+++.
 */

public class InvisibleMazeMain {

	static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2D array that makes a 5x5 grid
		InvisibleMazeGameTile [][] maze = new InvisibleMazeGameTile[5][5];
		
		//this represents the player object
		InvisibleMazePlayers user = new InvisibleMazePlayers();
		
		//row 1
		maze[0][0] = new InvisibleMazeGameTile(true, true, false);
		maze[0][1] = new InvisibleMazeGameTile(false, false, false);
		maze[0][2] = new InvisibleMazeGameTile(false, false, false);
		maze[0][3] = new InvisibleMazeGameTile(false, false, false);
		maze[0][4] = new InvisibleMazeGameTile(false, false, false);
		
		//row 2
		maze[1][0] = new InvisibleMazeGameTile(false, false, true);
		maze[1][1] = new InvisibleMazeGameTile(false, false, true);
		maze[1][2] = new InvisibleMazeGameTile(false, false, true);
		maze[1][3] = new InvisibleMazeGameTile(false, false, true);
		maze[1][4] = new InvisibleMazeGameTile(false, false, false);
		
		//row 3
		maze[2][0] = new InvisibleMazeGameTile(false, false, true);
		maze[2][1] = new InvisibleMazeGameTile(false, false, false);
		maze[2][2] = new InvisibleMazeGameTile(false, false, false);
		maze[2][3] = new InvisibleMazeGameTile(false, false, true);
		maze[2][4] = new InvisibleMazeGameTile(false, false, false);
		
		//row 4
		maze[3][0] = new InvisibleMazeGameTile(false, false, true);
		maze[3][1] = new InvisibleMazeGameTile(false, false, false);
		maze[3][2] = new InvisibleMazeGameTile(false, false, true);
		maze[3][3] = new InvisibleMazeGameTile(false, false, true);
		maze[3][4] = new InvisibleMazeGameTile(false, false, false);
		
		//row 5
		maze[4][0] = new InvisibleMazeGameTile(false, false, false);
		maze[4][1] = new InvisibleMazeGameTile(false, false, false);
		maze[4][2] = new InvisibleMazeGameTile(false, false, false);
		maze[4][3] = new InvisibleMazeGameTile(false, false, false);
		maze[4][4] = new InvisibleMazeGameTile(false, false, false);
		
		//prints out the maze
		Maze(maze);
		
		//introduce start of the game
		System.out.println("Welcome to the Invisible Maze Game! Please type which way you would like to go.");	
		System.out.println("(e.g. left, right, up, or down)");	
		
		movingInMaze(maze, user);
		
	}
	
	//prints out the maze layout
	public static void Maze(InvisibleMazeGameTile[][] temporaryMaze) {
	
			//this for loop will run if 'i' is less than the length of the temporaryMaze-1
			for(int i =0; i<=temporaryMaze.length-1; i++){
				
				//this will do the same but if 'j is less than the first row of i's length
				for(int j=0; j<=temporaryMaze[0].length-1; j++){
					
					//prints of the row
					System.out.print(temporaryMaze[i][j]);
					
					//comma to make it pretty and space of the lines
					System.out.print(", ");
					
				}
				System.out.println(" ");
			}
			//this will make it pretty by skipping a line
			System.out.println(" ");
		
	}
		
	public static void movingInMaze(InvisibleMazeGameTile[][] temporaryMaze, InvisibleMazePlayers user) {
		
		//take the user input
		String userInput = myReader.next();
		
		//NOTE TO SELF: hopping columns not rows
		
		//GOING TO THE RIGHT
		if(userInput.equals("right") || userInput.equals("Right")){
			
			//tells user if they are going out of bounds of the maze
			if(user.getcPos() >= 4) {
				
				System.out.println("Out of bounds!");
				
			}
			//if the players column position is less than or equal to 4
			else if(user.getcPos()<=4){
				
				//if the player inputs right this code will run and checks if there's a wall of it's going out of bounds
				if(temporaryMaze[user.getrPos()][user.getcPos()+1].getIsWall() == true){
					
					//basically like temporaryMaze
					//if it is true, the player will get the grids row/column position and reveal 
					temporaryMaze[user.getrPos()][user.getcPos()].setIsRevealed(true);
					
					//print out to let the player know if there is a wall there and tell them that they aren't able to move
					System.out.println("Hey there's a wall there, you're unable to move.");
					
				}
				//will check if there is not a wall & if there isn't than this code will run
				else if(temporaryMaze[user.getrPos()][user.getcPos()+1].getIsWall() == false){
					
					//leaves the player in the same row and moves columns if not out of bounds
					temporaryMaze[user.getrPos()][user.getcPos()+1].setIsRevealed(true);
					
					//sets the players position
					temporaryMaze[user.getrPos()][user.getcPos()].setHasPlayer(false);
					
					//moves the player forward
					temporaryMaze[user.getrPos()][user.getcPos()+1].setHasPlayer(true);
					
					//moves the user to the spot
					user.setC(user.getcPos()+1);
					
					//print of the move taken
					System.out.println("You moved right one block");
					
				}
		
			}
	
		}
		//GOING TO THE LEFT
		else if(userInput.equals("left") || userInput.equals("Left")){
			
			//tells user if they are going out of bounds of the maze
			if(user.getcPos() <= 0) {
				
				System.out.println("Out of bounds!");
				
			}
			//if the players column position is <= to 0
			else if(user.getcPos()>=0){
				
				//if the player inputs right this code will run and checks if there's a wall of it's going out of bounds
				if(temporaryMaze[user.getrPos()][user.getcPos()-1].getIsWall()){
						
					//this line of code will set the players position to true and will reveal a W (for WALL)
					temporaryMaze[user.getrPos()][user.getcPos()-1].setIsRevealed(true);
						
					//this print statement will be printed if the statements above can run
					System.out.println("Hey there's a wall there, you're unable to move.");
			
				}
				//this code will run if there is not a wall & not going out of bounds
				else if(!temporaryMaze[user.getrPos()][user.getcPos()-1].getIsWall()){
						
					//leaves the player in the same column or row and change the hasPlayer = false
					temporaryMaze[user.getrPos()][user.getcPos()].setHasPlayer(false);
					
					//sets the players position
					user.setC(user.getcPos()-1);
					
					//sets the players new position = true
					temporaryMaze[user.getrPos()][user.getcPos()].setHasPlayer(true);
					
					//prints out where the player has moved
					System.out.println("You moved left one block");
					
				}
				
			}
			
		}
		//GOING UP
		else if(userInput.equals("up") || userInput.equals("Up")){

			//tells user if they are going out of bounds of the maze
			if(user.getrPos() <= 0) {
				
				System.out.println("Out of bounds!");
				
			}
			//if the players row position is less than or equal to 0
			else if(user.getrPos()>=0){
						
				//if there is a wall and if its out of bounds then this code will run
				if(temporaryMaze[user.getrPos()-1][user.getcPos()].getIsWall() == true){
							
					//this line of code will set the players column/row position to true
					temporaryMaze[user.getrPos()-1][user.getcPos()].setIsRevealed(true);
					
					//prints as long as the statements above are true and will reveal a wall
					System.out.println("There's a wall there, you're unable to move.");
					
				}
				//this else if statement will run if there is no wall there
				else if(temporaryMaze[user.getrPos()-1][user.getcPos()].getIsWall() == false){
							
					//sets the players position = true
					temporaryMaze[user.getrPos()-1][user.getcPos()].setIsRevealed(true);
					
					//sets the tile the player was on = false
					temporaryMaze[user.getrPos()][user.getcPos()].setHasPlayer(false);
							
					//sets the tile the player is on = true
					temporaryMaze[user.getrPos()-1][user.getcPos()].setHasPlayer(true);
					
					//this will change the players r position
					user.setR(user.getrPos()-1);
					
					//print of the move taken
					System.out.println("You moved up one block");
							
				}
		
			}
	
		}
		//GOING DOWN
		else if(userInput.equals("down") || userInput.equals("Down")){
			
			//tells user if they are going out of bounds of the maze
			if(user.getrPos() >= 4) {
				
				System.out.println("Out of bounds!");
				
			}
			//this statement will run if the players row position is greater than 4
			else if(user.getrPos() >= 4){
				
				//if the player is out of bounds.. then this print statement will run
				System.out.println("Too far");
				
			}
			//this else statement will run after
			else {
				
				//this will get the wall
				if(temporaryMaze[user.getrPos()+1][user.getcPos()].getIsWall()){
					
					//this will check if there is a wall
					temporaryMaze[user.getrPos()+1][user.getcPos()].setIsRevealed(true);
					
					//this code will print out that there is a wall
					System.out.println("there is a wall there.. You can't move!");
					
				}
				else {
					
					//reveals the players position it was on first to = true
					temporaryMaze[user.getrPos()+1][user.getcPos()].setIsRevealed(true);
					
					//the player's old position will change to = false
					temporaryMaze[user.getrPos()][user.getcPos()].setHasPlayer(false);
					
					//make the player's the new position to = true
					temporaryMaze[user.getrPos()+1][user.getcPos()].setHasPlayer(true);
					
					//this will change the players position 
					user.setR(user.getrPos()+1);
					
					//print of the move taken
					System.out.println("You moved down one block");
					
				}
				
			}
			
		}
		//continues to print out the maze each turn
		Maze(temporaryMaze);
		
		//checks if the player landed the target successfully
		if(user.getrPos() == 4 && user.getcPos() == 0){
					
			//prints out that they are winna winna chicken dinnas
			System.out.println("Congrats, you won! #yessahhhhhhblessahhhh");
			
		}
		else {
			
			//this will go back to the beginning if they didn't reach the target yet
			movingInMaze(temporaryMaze, user);
				
		}
			
	}
	
}
	
