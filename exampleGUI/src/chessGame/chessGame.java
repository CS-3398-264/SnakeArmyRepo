package chessGame;

public class chessGame {
	
	public String[] gamePlacement;
	
	public chessGame(){
	gamePlacement = new String[64];
	
    for (int i = 0; i<64; i++) {
    	if (i==0 ||i == 7)
    		gamePlacement[i] = "BRook";
    	else if (i==1||i==6)
    		gamePlacement[i] = "BKnight";
    	else if (i==2||i==5)
    		gamePlacement[i] = "BBishop";
    	else if (i==3)
    		gamePlacement[i] = "BQueen";
    	else if (i==4)
    		gamePlacement[i] = "BKing";
    	else if (i==63 ||i == 56)
    		gamePlacement[i] = "WRook";
    	else if (i==62||i==57)
    		gamePlacement[i] = "WKnight";
    	else if (i==61||i==58)
    		gamePlacement[i] = "WBishop";
    	else if (i==59)
    		gamePlacement[i] = "WQueen";
    	else if (i==60)
    		gamePlacement[i] = "WKing";
    	
    	else if (i>7 && i <16)
    	    gamePlacement[i] = "BPawn";
    	else if(i>47 && i < 56)
    		gamePlacement[i] = "WPawn";
    	else 
    		gamePlacement[i] = null; 
    }
	}
}

