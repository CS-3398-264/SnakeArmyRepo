package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KingTest {

	@Test
	void test() {
		King test = new King(0);
		
		//check general movement
		assertEquals(true, test.validMove(27, 19));
		assertEquals(true, test.validMove(27, 20));
		assertEquals(true, test.validMove(27, 28));
		assertEquals(true, test.validMove(27, 26));
		assertEquals(true, test.validMove(27, 18));
		assertEquals(true, test.validMove(27, 34));
		assertEquals(true, test.validMove(27, 35));
		assertEquals(true, test.validMove(27, 36));
		
		//check for invalid movement(more than 1 tile in any direction)
		assertEquals(false, test.validMove(27, 11));
		assertEquals(false, test.validMove(27, 13));
		assertEquals(false, test.validMove(27, 10));
		assertEquals(false, test.validMove(27, 25));
		assertEquals(false, test.validMove(27, 29));
		assertEquals(false, test.validMove(27, 41));
		assertEquals(false, test.validMove(27, 43));
		assertEquals(false, test.validMove(27, 45));
	}

}
