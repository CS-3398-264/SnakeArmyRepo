package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chessGame.chessGame;

class KnightTest {

	@Test
	void test() {
		Knight test = new Knight(0);
		
		//testing for valid movements
		
		assertEquals(true, test.validMove(27, 12));
		assertEquals(true, test.validMove(27, 10));
		assertEquals(true, test.validMove(27, 17));
		assertEquals(true, test.validMove(27, 33));
		assertEquals(true, test.validMove(27, 42));
		assertEquals(true, test.validMove(27, 44));
		assertEquals(true, test.validMove(27, 21));
		assertEquals(true, test.validMove(27, 37));
		
		// testing for invalid movements
		
		assertEquals(false, test.validMove(27, 9));
		assertEquals(false, test.validMove(27, 13));
		assertEquals(false, test.validMove(27, 4));
		assertEquals(false, test.validMove(27, 52));
		assertEquals(false, test.validMove(27, 123));
		assertEquals(false, test.validMove(27, 12321));
		assertEquals(false, test.validMove(27, -102));
		assertEquals(false, test.validMove(27, 1213));
		
		//testing that can move and take enemy piece
		chessGame newGame = new chessGame();
		//spot 10 = BPawn
		assertEquals(true, test.validMove(27, 10));
		//spot 12 = BPawn
		assertEquals(true, test.validMove(27, 12));
		
	}

}
