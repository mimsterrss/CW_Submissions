

public class InvisibleMazePlayers {

	int rPos;
	int cPos;
	
	public InvisibleMazePlayers() {
		
		//sets both rPos & cPos (attributes) to zero
		rPos = 0;
		cPos = 0;
		
	}
	
	public int[] getPos() {
		
		//puts the rPos & cPos together
		int[] pos = {rPos, cPos};
		
		//returns the pos
		return pos;
		
	}
	
	//gets the rows
	public int getrPos() {
		
		return rPos;
	
	}

	//sets the rPos
	public void setrPos(int rPos) {
	
		this.rPos = rPos;
		
	}

	//gets the columns
	public int getcPos() {
		
		return cPos;
		
	}

	//sets the cPos
	public void setcPos(int cPos) {
		
		this.cPos = cPos;
		
	}
	
	//sets the columns
	public void setC(int newC){
		
		cPos = newC;
		
	}
	
	//sets the rows
	public void setR(int newR){
		
		rPos = newR;
	}
	
}

