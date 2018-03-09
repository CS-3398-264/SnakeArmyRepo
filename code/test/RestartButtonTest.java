package gui;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.jupiter.api.Test;

import Pieces.Pawn;
import Pieces.Piece;
import Pieces.Rook;
import chessGame.chessGame;
import gui.Board.TilePanel;

class RestartButtonTest extends Board{
	chessGame newGame = new chessGame();
	
	//restart button
	public void restart() {
		newGame = new chessGame();
		Board.turnTime = 0;
	}

	@Test
	void test() {
		//copy original game interface data
		Piece [] tempArr = new Piece[64];
		for(int i = 0; i < 64; i++) {
			tempArr[i] = newGame.p[i];
		}
		
		//change game interface
		for(int j = 0; j < 64; j++) {
			newGame.p[j] = new Rook(0);
		}
		
		//call restart method
		restart();
	
		for(int d = 0; d < 64; d++) {
			assertEquals(tempArr[d].getName(), newGame.p[d].getName());
			
		}
	}

}
