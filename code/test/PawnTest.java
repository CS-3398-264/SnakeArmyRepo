package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chessGame.chessGame;

class PawnTest {

	@Test
	void test() {
		Pawn test = new Pawn(0); // white test
		Pawn test1 = new Pawn(1); // black test 
		
		//general movement test, 1 square for Black and White
		assertEquals(true, test.validMove(48, 40));
		assertEquals(true, test1.validMove(0, 8));
		
		//Checking double jump for white
		if(test.hasMoved == false) {
			assertEquals(true, test.validMove(49, 41));
			assertEquals(true, test.validMove(49, 33));
	
		}
		
		if(test.hasMoved == true) {
			assertEquals(false, test.validMove(55, 39));
			assertEquals(true, test.validMove(52, 44));
		}

		//Checking double jump for black
		
		if(test1.hasMoved == false) {
			assertEquals(true, test1.validMove(0, 16));
			assertEquals(true, test1.validMove(2, 18));
			assertEquals(false, test1.validMove(2, 26));
		}
		
		if(test1.hasMoved == true) {
			assertEquals(false, test1.validMove(0, 16));
			assertEquals(true, test1.validMove(6, 14));
		}
		
		//testing for captures (white capture black)
		chessGame newGame = new chessGame();
		newGame.p[27].setImageName("BPawn");
		newGame.p[34].setImageName("WPawn");
		if(newGame.p[27].getImageName() == "BPawn" && newGame.p[34].getImageName() == "WPawn") {
			assertEquals(true, test.validMove(34, 27));
		}
		
		newGame.p[46].setImageName("WPawn");
		newGame.p[37].setImageName("BPawn");
		if(newGame.p[37].getImageName() == "BPawn" && newGame.p[46].getImageName() == "WPawn") {
			assertEquals(true, test.validMove(46, 37));
		}
		//testing for captures (black capture white)
		newGame.p[12].setImageName("BPawn");
		newGame.p[19].setImageName("WPawn");
		if(newGame.p[12].getImageName() == "BPawn" && newGame.p[19].getImageName() == "WPawn" && newGame.turn == 1) {
			assertEquals(true, test.validMove(12, 19));
			assertEquals(false, test.validMove(12, 5));
			assertEquals(false, test.validMove(19, 12));
			
		}
		
		newGame.p[43].setImageName("BPawn");
		newGame.p[50].setImageName("WPawn");
		if(newGame.p[43].getImageName() == "BPawn" && newGame.p[50].getImageName() == "WPawn" && newGame.turn == 1) {
			assertEquals(true, test.validMove(43, 50));
			assertEquals(false, test.validMove(50,43));
			assertEquals(false, test.validMove(43, 44));
			
		}
		
		
		
		
		//negative tests
		assertEquals(false, test.validMove(48, 49));
		assertEquals(false, test.validMove(48, 47));
		assertEquals(false, test.validMove(48, 39));
		assertEquals(false, test.validMove(48, 57));
		
		
		
	
	}
}
