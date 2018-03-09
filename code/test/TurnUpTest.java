package gui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chessGame.chessGame;

class TurnUpTest {

	@Test
	void test() {
		chessGame newGame = new chessGame();
		//white turn
		if(newGame.turn == 0) {
			newGame.changeTurn();
			assertEquals(1, newGame.turn);
		}
		if(newGame.turn == 1) {
			newGame.changeTurn();
			assertEquals(0, newGame.turn);
		}
	}

}
