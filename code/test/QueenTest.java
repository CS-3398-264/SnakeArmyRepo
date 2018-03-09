package Pieces;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.jupiter.api.Test;

import chessGame.chessGame;
import gui.Board;

class QueenTest {
	private class GravePanel extends JPanel{
		
		GravePanel(){
		  JLabel tittle = new JLabel("Grave Yard Tile");
		  this.add(tittle);
		}
		void graveYardAdd(String piece){
			System.out.println(piece);
		  String description = (piece);
	      JLabel add = new JLabel(description);
	      this.add(add);
	      revalidate();
	     
		}
		
	}
		

	
	@Test
	void test() {
		
		chessGame newGame = new chessGame();
		Board board = new Board();
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
		
		//taking
		newGame.p[35] = new Rook(1);
		newGame.p[43] = new Queen(0);
		assertEquals(true, test.validMove(43, 35));
		assertEquals(false, test.validMove(43, 4));



	}
}

