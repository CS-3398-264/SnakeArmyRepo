package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		
		//negative tests
		assertEquals(false, test.validMove(48, 49));
		assertEquals(false, test.validMove(48, 47));
		assertEquals(false, test.validMove(48, 39));
		assertEquals(false, test.validMove(48, 57));
	
	}
}
