import java.util.Scanner;

/** 
 * My name is Mimi and it's Wednesday, April 2nd, 2025. This is my Tic-Tac-Toe Project. In this project there will be logic,
 * 2-D Array used, loops, and much more. There will two players and if they get three X's in a straight line, they win! YAY!
 */

public class tic_tac_toe {

	//opens scanner so the players can type in the console
	static Scanner gameReader = new Scanner(System.in);
	
	//checks if there's a three in a row (tic-tac-toe!!)
	static boolean checker = false;
	static String[][] grid = new String [3][3];
	public static void main(String[] args) {
		
		//welcome statement
		System.out.println("Welcome to Tic-Tac-Toe! Your grid to play is below. You can only win with horizontal OR vertical lines. Have fun!");
		//spaces out grid & statement to make it look pretty & organized
		System.out.println("");
		
		//2-D Array
		String[][] grid = 
		{
			
			{"[ ]", "[ ]", "[ ]"},
			{"[ ]", "[ ]", "[ ]"},
			{"[ ]", "[ ]", "[ ]"}	
				
		};
		
		
		while(checker == false) {
			
			
			//prints out a blank grid using the format above of 'grid'
			printOutGrid(grid);
			System.out.println("");
			
			//this will introduce the first player ('X') and let them choose their first square
			firstPlayer(grid);
			System.out.println("");
			
			//this will introduce the second player ('O') and let them choose their first square
			secondPlayer(grid);
			System.out.println("");
			
			if(checker == true) {
				
				//checks if there's a three in a row & tells them that they won
				winner();
			
			}
		}

	}

	
	
	
	//this method will print out the grid of 3x3
	public static void printOutGrid(String[][] num) {
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num.length; j++) {
				
				System.out.print(num[i][j]);
				System.out.print(", ");
				
			}
			System.out.println(" ");
			
		}
		System.out.print(" ");
		

	}
	
	
	public static void firstPlayer(String[][] num) {
		
		System.out.println("Player X.");
		System.out.println("Please write where on the grid you would like to place your 'X'. (i.e. 'top right', 'middle', bottom left', 'middle left', 'top middle').");
		
		String playerX = new String(gameReader.nextLine());
		
		if(playerX.equals("middle") || playerX.equals("Middle")) {
			
			num[1][1] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("top left") || playerX.equals("Top Left")) {
		
			num[0][0] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("top middle") || playerX.equals("Top Middle")) {
			
			num[0][1] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("top right") || playerX.equals("Top Right")) {
			
			num[0][2] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("middle left") || playerX.equals("Middle Left")) {
			
			num[1][0] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("middle right") || playerX.equals("Middle Right")) {
			
			num[1][2] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("bottom left") || playerX.equals("Bottom Left")) {
			
			num[2][0] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("bottom middle") || playerX.equals("Bottom Middle")) {
			
			num[2][1] = "X";
			printOutGrid(num);
			
		}
		else if(playerX.equals("bottom right") || playerX.equals("Bottom Right")) {
			
			num[2][2] = "X";
			printOutGrid(num);
			
		}
		
	}
	
	public static void secondPlayer(String[][] num) {
		
		System.out.println("Player O.");
		System.out.println("Please write where on the grid you would like to place your 'O'. (i.e. 'top right', 'middle', 'bottom left', 'middle left', 'top middle').");
		
		String playerO = new String(gameReader.nextLine());
		
		if(playerO.equals("middle") || playerO.equals("Middle")) {
			
			num[1][1] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("top left") || playerO.equals("Top Left")) {
		
			num[0][0] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("top middle") || playerO.equals("Top Middle")) {
			
			num[0][1] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("top right") || playerO.equals("Top Right")) {
			
			num[0][2] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("middle left") || playerO.equals("Middle Left")) {
			
			num[1][0] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("middle right") || playerO.equals("Middle Right")) {
			
			num[1][2] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("bottom left") || playerO.equals("Bottom Left")) {
			
			num[2][0] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("bottom middle") || playerO.equals("Bottom Middle")) {
			
			num[2][1] = "O";
			printOutGrid(num);
			
		}
		else if(playerO.equals("bottom right") || playerO.equals("Bottom Right")) {
			
			num[2][2] = "O";
			printOutGrid(num);
			
		}
		
	}
	
	public static String[][] winner(){
		
		//grid[0][1] == "X" || grid[0][1] == "O"
		//!(grid[0][0] == "[ ]"
		//checks if there's a row (horizontal) win
		if(grid[0][0] == grid[0][1] && grid[0][2] == grid[0][1] && !(grid[0][0] == "[ ]")) {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		if(grid[1][0] == grid[1][1] && grid[1][2] == grid[1][1] && grid[1][0] == "X" || grid[1][0] == "O") {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		if(grid[2][0] == grid[2][1] && grid[2][2] == grid[2][1] && grid[2][0] == "X" || grid[2][0] == "O") {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		
		//checks if there's a column (vertical) win
		if(grid[0][0] == grid[1][0] && grid[2][0] == grid[1][0] && grid[0][0] == "X" || grid[0][0] == "O") {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		if(grid[0][1] == grid[1][1] && grid[2][1] == grid[1][1] && grid[0][1] == "X" || grid[0][1] == "O") {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		if(grid[0][2] == grid[1][2] && grid[1][2] == grid[2][1] && grid[0][2] == "X" || grid[0][2] == "O") {
			
			checker = true;
			System.out.println("Congrats, you win! #yesssaahhhh");
			
		}
		return grid;

		
	}
	
}






	
