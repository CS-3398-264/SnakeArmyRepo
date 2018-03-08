package chessGame;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class GameOverTest {
	int turn;
	 public String gameOver() {
		    final String winner;
		    if(turn != 1) 
			  winner = "Black";
		    else
			  winner = "White";
		    System.out.println("Game over "+winner+" wins");
		    JOptionPane.showMessageDialog(null, "Game over "+winner+" wins");
		    return winner;
		  }
	
	
	@Test
	void test() {
		turn = 1;
		boolean whiteWins = false;
		if(gameOver() == "White") {
			whiteWins = true;
			
		}
		else if(gameOver() == "Black") {
			whiteWins = false;
		}
		assertEquals(true, whiteWins);
		
		turn = 0;
		whiteWins = false;
		if(gameOver() == "White") {
			whiteWins = true;
		}
		else if(gameOver() == "Black") {
			whiteWins = false;
		}
		assertEquals(false, whiteWins);
		
	}

}
