package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chessGame.chessGame;

class BishopTest {

	chessGame newGame = new chessGame();
	
	@Test
	void test() {
		Bishop test = new Bishop(0);
		//valid diagonal moves from white / black sides
		assertEquals(true, test.validMove(2, 11));
		assertEquals(true, test.validMove(2, 9));
		assertEquals(true, test.validMove(58, 51));
		assertEquals(true, test.validMove(58, 49));
		
		//valid diagonal moves from middle
		assertEquals(true, test.validMove(35, 28));
		assertEquals(true, test.validMove(35, 26));
		assertEquals(true, test.validMove(35, 42));
		assertEquals(true, test.validMove(35, 44));
		
		//invalid movements( + direction for black) 
		assertEquals(false, test.validMove(2, 3));
		assertEquals(false, test.validMove(2, 10));
		assertEquals(false, test.validMove(2, 1));
		assertEquals(false, test.validMove(2, 18));
		
		//invalid movements( + direction for white) 
		assertEquals(false, test.validMove(58, 59));
		assertEquals(false, test.validMove(58, 57));
		assertEquals(false, test.validMove(58, 50));
		assertEquals(false, test.validMove(58, 66));
		
		//invalid movements ( + direction for middle)
		assertEquals(false, test.validMove(35, 34));
		assertEquals(false, test.validMove(35, 36));
		assertEquals(false, test.validMove(35, 27));
		assertEquals(false, test.validMove(35, 43));
		
		
		//move pawn
		newGame.p[51] = new Piece();
		//check if can move
		if(newGame.p[51].getName() == null) {
			System.out.println("tst");
			assertEquals(true, test.validMove(58, 51));
		}
		//Enemy pawn, check if can take diagonal
		newGame.p[49] = new Pawn(1);
		assertEquals(true, test.validMove(58, 49));
		assertEquals(true, availableMove(58, 49));
		
	
	}

	
	private boolean availableMove(int start, int end) {
		int product = end - start;	
		
		if(newGame.p[start].getImageName() == "WPawn"){
			if((product == -7|| product == -9) && newGame.p[end].getAlly()!=1)
				return false;
			else if(product == -8 && newGame.p[end].getAlly()==1)
				return false;
			else if(product == -16 && newGame.p[end].getAlly()==1)
				return false;
			else 
				return true;
		}
		else if(newGame.p[start].getImageName() == "BPawn"){
			if((product == 7|| product == 9) && newGame.p[end].getAlly()!=0)
				return false;
			else if(product == 8 && newGame.p[end].getAlly()==0)
				return false;
			else if(product == 16 && newGame.p[end].getAlly()==0)
				return false;
			else 
				return true;
		}

		else if((newGame.p[start].getPieceType() == "King"|| newGame.p[start].getPieceType() == "Knight")) {
			return true;
		}
		//horizontal
		else if(end/8 == start/8) {
			int firstinRow = (start/8)*8;
			int left = firstinRow;
			int right = firstinRow+7;
			for(int i = 0; i<8; i++) {
				if(newGame.p[i+firstinRow].getAlly() != -1 && (i+firstinRow)>left && (i+firstinRow)<start)
					left = (i+firstinRow);
				if(newGame.p[i+firstinRow].getAlly() != -1 && (i+firstinRow)<right && (i+firstinRow)>start)
					right = (i+firstinRow);
			}
			if( end >right || end <left)
				return false;
		}
		//vertical
		else if(product%8 == 0) {
			int firstinColumn = start%8;
			int up = firstinColumn;
			int down = firstinColumn+56;
			for (int i = firstinColumn; i<=(firstinColumn+56); i=i+8) {
				if(newGame.p[i].getAlly() != -1 && (i) > up && i < start)
					up = i;
				if(newGame.p[i].getAlly() != -1 && (i) < down && i > start)
					down = i;
				if(end>down || end<up)
					return false;
			}
		}
		//diagonal
		else {
			int downRight = 63;
			int downLeft = 63;
			int upRight = 0;
			int upLeft = 0;
			int diagLStart = start;
			int diagRStart = start;
			
			while(diagLStart%8 != 7 && diagLStart>0) {
				diagLStart = diagLStart-7;
			}
			diagLStart = diagLStart + 7;
			
			while(diagRStart%8 != 0 && diagRStart>0) {
				diagRStart = diagRStart-9;
			}
			diagRStart = diagRStart+9;
			for(int i = diagRStart; i<63; i=i+9) {
				if(newGame.p[i].getAlly() != -1 && i>upLeft && i < start)
					upLeft = i;
				if(newGame.p[i].getAlly() != -1 && i<downRight && i > start)
					downRight = i;
			}
			for(int i = diagLStart; i<63; i=i+7) {
				if(newGame.p[i].getAlly() != -1 && i > upRight && i < start)
					upRight = i;
				if(newGame.p[i].getAlly() != -1 && i < downLeft && i > start)
					downLeft = i;
			}
			if(product%7 == 0 &&(end > downLeft || end < upRight))
				return false;
			else if(product%9 == 0 &&(end > downRight || end < upLeft))
				return false;

		}
		return true;
	}
	
}
