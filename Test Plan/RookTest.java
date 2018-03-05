package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RookTest {

	@Test
	void test() {
		
		//Checking general movements (left / right || up / down)
		Rook test = new Rook(0);
		
		assertEquals(true, test.validMove(41,42));
		assertEquals(true, test.validMove(41,33));
		assertEquals(true, test.validMove(41,59));
		assertEquals(true, test.validMove(41,40));
		
		assertEquals(false, test.validMove(41,34));
		assertEquals(false, test.validMove(41,48));
		assertEquals(false, test.validMove(41,50));
		assertEquals(false, test.validMove(41,25));
		
		
	}

}
