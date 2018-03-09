package chessGame;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.jupiter.api.Test;

class GameOverTest {
	int turn;
	 public String gameOver() {
		    final String winner;
		    if(turn != 1) 
			  winner = "Black";
		    else
			  winner = "White";
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
		
		//white wins
		whiteWins = true;
		JOptionPane.showMessageDialog(null, "End game?");
			gameOver();
		assertEquals(true, whiteWins);
		
		
	}

}
