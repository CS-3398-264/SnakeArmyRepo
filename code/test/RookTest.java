package Pieces;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

import chessGame.chessGame;
import gui.Board;

class RookTest {

	@Test
	void test() {
		chessGame newGame = new chessGame();
		Board board = new Board();
		
		//Checking general movements (left / right || up / down)
		Rook test = new Rook(0);
		
		assertEquals(true, test.validMove(41,42));
		assertEquals(true, test.validMove(41,33));
		assertEquals(true, test.validMove(41,40));
		assertEquals(true, test.validMove(41,25));
		
		assertEquals(false, test.validMove(41,34));
		assertEquals(false, test.validMove(41,48));
		assertEquals(false, test.validMove(41,50));
		
		
		
		newGame.p[34].setImageName("BPawn");
		newGame.p[42].setImageName("WRook");
		newGame.p[39].setImageName("BPawn");
		newGame.p[63].setImageName("WRook");
	
		
	}
	
	
	
		
	
}
