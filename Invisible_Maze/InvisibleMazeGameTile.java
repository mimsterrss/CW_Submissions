
/**
 * This is my game tile class. This holds all the methods of checking if there's a wall, where the user is, and 
 * reveals different parts of the games to the user. 
 */
public class InvisibleMazeGameTile {

	boolean hasPlayer;
	boolean isRevealed;
	boolean isWall;
	
	public InvisibleMazeGameTile(boolean hP, boolean isR, boolean isW) {
		
		//different booleans to check where the player is, reveal different things to the player, and if there is a wall in the way
		hasPlayer = hP;
		isRevealed = isR;
		isWall = isW;
		
	}

	//the boolean method isHasPlayer
	public boolean isHasPlayer() {
		
		return hasPlayer;
		
	}

	//setter for the isHasPlayer method
	public void setHasPlayer(boolean hasPlayer) {
		
		this.hasPlayer = hasPlayer;
		
	}

	//the boolean method isRevealed
	public boolean isRevealed() {
		
		return isRevealed;
		
	}

	//setter for the isRevealed method
	public void setIsRevealed(boolean isRevealed) {
		
		this.isRevealed = isRevealed;
		
	}

	//the boolean isWall method
	public boolean isWall() {
		
		return isWall;
		
	}

	//setter for the isWall method
	public void setWall(boolean isWall) {
		
		this.isWall = isWall;
		
	}
	
	//getter for the hasPlayer method
	public boolean getHasPlayer(){
		
		return hasPlayer;
			
	}
	
	//getter for the hasPlayer method
	public boolean getIsRevealed(){
		
			return isRevealed;
			
	}
	
	//getter for the isWall method
	public boolean getIsWall(){

		return isWall;
		
	}
	

	//functionality
	public String toString() {
		
		//if the hasPlayer equals true, it will return "p" where for player is in the maze
		if(hasPlayer == true) {
			
			return "P";
			
		}
		//if isRevealed is false, it will return "*" to display that that square has been revealed
		if(isRevealed == false) {
			
			return "*";
			
		}
		//if isRevealed is true, it will check if there other things to look forward to
		else if(isRevealed == true) {
			
			//checks if there is a wall in the way
			if(isWall == true) {
				
				//tells player that there's a wall in the way
				return "W";
				
			}
			else {
				
				//if there is no wall, it will return "X" 
				return "X";
				
			}
			
		}
		return "A";
		
	}
	
	

}
