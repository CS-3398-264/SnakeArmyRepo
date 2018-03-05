package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BishopTest {

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
		
		
		
		
	}

}
