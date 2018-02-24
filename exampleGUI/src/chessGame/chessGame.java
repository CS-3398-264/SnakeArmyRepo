package chessGame;
import Pieces.Piece;


public class chessGame {
	
	public String[] gamePlacement;
	public int turn; //0=white 1=black
	public int turnNumber;
	public Piece[] p = new Piece[64];
	
	
	public chessGame(){
	
    for (int i = 0; i<64; i++) {
    	p[i] = new Piece();
    	if (i==0 ||i == 7) {
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black Rook");
    		p[i].setImageName("BRook");
    	}
    	else if (i==1||i==6){
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black Knight");
    		p[i].setImageName("BKnight");
    	}
    	else if (i==2||i==5){
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black Bishop");
    		p[i].setImageName("BBishop");
    	}
    	else if (i==3){
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black Queen");
    		p[i].setImageName("BQueen");
    	}
    	else if (i==4){
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black King");
    		p[i].setImageName("BKing");
    	}
    	else if (i==63 ||i == 56){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White Rook");
    		p[i].setImageName("WRook");
    	}
    	else if (i==62||i==57){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White Knight");
    		p[i].setImageName("WKnight");
    	}
    	else if (i==61||i==58){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White Bishop");
    		p[i].setImageName("WBishop");
    	}
    	else if (i==59){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White Queen");
    		p[i].setImageName("WQueen");
    	}
    	else if (i==60){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White King");
    		p[i].setImageName("WKing");
    	}
    	
    	else if (i>7 && i <16){
    		p[i].setAlly(1);
    		p[i].moveLocation(i);
    		p[i].setName("Black Pawn");
    		p[i].setImageName("BPawn");
    	}
    	else if(i>47 && i < 56){
    		p[i].setAlly(0);
    		p[i].moveLocation(i);
    		p[i].setName("White pawn");
    		p[i].setImageName("WPawn");
    	}
    }
    turn = 0; 
    turnNumber = 0;
	}
  public void changeTurn() {
	  if(turn == 0)
		  turn = 1;
	  else
		  turn = 0;
  }
  public void turnUp() {
	  turnNumber++;
  }
}

