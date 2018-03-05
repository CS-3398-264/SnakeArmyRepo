package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueenTest {

	@Test
	void test() {
		Queen test = new Queen(0);
		//possible movements
		assertEquals(true, test.validMove(60, 61));
		assertEquals(true, test.validMove(60, 36));
		assertEquals(true, test.validMove(60, 56));
		assertEquals(true, test.validMove(60, 51));
		assertEquals(true, test.validMove(60, 42));
		assertEquals(true, test.validMove(35, 21));
		
		//impossible movements
		assertEquals(false, test.validMove(4, 15));
		assertEquals(false, test.validMove(60, 90));
		assertEquals(false, test.validMove(60, 50));
		assertEquals(false, test.validMove(60, 54));
		assertEquals(false, test.validMove(4, 10));
		assertEquals(false, test.validMove(4, 14));
		
		
	}

}
