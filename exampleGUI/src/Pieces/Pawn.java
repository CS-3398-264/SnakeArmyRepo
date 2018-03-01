package Pieces;

public class Pawn extends Piece{
	
	private boolean valid = false;
	
	public Pawn(int ally) {
		hasMoved = false;
		if(ally == 0) {
			setAlly(0);
			setName("White Pawn");
			setImageName("WPawn");
		}
		else {
			setAlly(1);
			setName("Black Pawn");
			setImageName("BPawn");
		}
	}
	
	public boolean validMove(int start, int end) {
		
		valid = false;
		if(this.getAlly()==0) {
			int product = end-start;
			if(product == -8) {
				valid = true;
			}
			else if(product == -16 && hasMoved == false) {
				valid = true;
			}
			/*PSEUDOCODE-ISH - when trying to eat an opponent with pawn
			 * else if ((product == -7 || product == -9) && the space in product -7 or -9 is occuppied by getAlly() == 1) // so you eat it
			 *	valid = true; */
		}
		else if(this.getAlly()==1) {
			int product = end-start;
			if(product == 8) {
				valid = true;
			}
			else if(product == 16 && hasMoved == false) {
				valid = true;
			}
			/*PSEUDOCODE-ISH - when trying to eat an opponent with pawn
			 * else if ((product == 7 || product == 9) && the space in product 7 or 9 is occuppied by getAlly() == 0) // so you eat it
			 *	valid = true; */
		}
		hasMoved = true;
		return valid;
    }

}
