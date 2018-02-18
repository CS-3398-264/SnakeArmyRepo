package gui;

import javax.swing.*;

import chessGame.chessGame;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Board {
	
	private Color whiteTiles = Color.decode("#edebd3");
	private Color blackTiles = Color.decode("#545239");
	public static int selected = -1; //when no piece is selected equals -1
	chessGame newGame = new chessGame();
	
	private final JFrame gameFrame;
	private final BoardPanel boardPanel;
	
	private final static Dimension BOARD_PANEL = new Dimension(80, 80);
	private final static Dimension TILE_PANEL = new Dimension(20, 20);
	
	public Board() {
		this.gameFrame = new JFrame("Chess");
		this.gameFrame.setLayout(new BorderLayout());
		this.gameFrame.setSize(800, 800);
		
		this.boardPanel = new BoardPanel();
		this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);
		this.gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.gameFrame.setVisible(true);
	}

private class BoardPanel extends JPanel{
	final List<TilePanel> boardTiles; 
	
	BoardPanel(){
		super(new GridLayout(8,8));
		this.boardTiles = new ArrayList<>();
		for(int i = 0; i < 64; i++) {
			final TilePanel tilePanel = new TilePanel(this, i);
			this.boardTiles.add(tilePanel);
			add(tilePanel);
		}
		this.setSize(BOARD_PANEL);
		validate();
	}
	void drawBoard(final chessGame newGame) {
		for (final TilePanel tilePanel: boardTiles) {
			tilePanel.drawTile(newGame);
			add(tilePanel);
		}
		validate();
		repaint();
	}
}

private class TilePanel extends JPanel{
	
	private final int tileID;
	
	TilePanel(final BoardPanel boardPanel, final int tileID){
	  super(new GridBagLayout());
	  this.tileID = tileID; 
	  this.setPreferredSize(TILE_PANEL);
	  assignTileColor();
	  assignTileSprite();
	  
	  addMouseListener(new MouseAdapter() {
		  @Override
		  public void mousePressed(MouseEvent e) {
			 if (Board.selected==-1) {
				 if(newGame.gamePlacement[tileID] != null) {
				     Board.selected = tileID;
				 }
				 else 
					 Board.selected = -1;
			 }
			 else if ((Board.selected!=-1 && newGame.gamePlacement[tileID]!=null)) {
				 //do nothing
			 }
			 else {
				 newGame.gamePlacement[tileID] = newGame.gamePlacement[Board.selected];
				 newGame.gamePlacement[Board.selected] = null;
				 Board.selected = -1;
				 
			 }
			 SwingUtilities.invokeLater(new Runnable() {
				 @Override
				 public void run() {
					 boardPanel.drawBoard(newGame);
				 }
			 });
			  
		  }

	  });
	  validate();
	  	
    }
	void drawTile(final chessGame newGame) {
		removeAll();
		assignTileColor();
		assignTileSprite();
		validate();
		repaint();
	}
	
	private void assignTileSprite() {
		JLabel sprite = new JLabel();
		sprite.setIcon(new ImageIcon("sprites\\"+newGame.gamePlacement[this.tileID]+".png"));
		add(sprite);
		validate();
	}
		
	private void assignTileColor() {
		if((this.tileID/8)% 2==0 )
		    setBackground(this.tileID %2 == 0 ? whiteTiles : blackTiles);
		else 
			setBackground(this.tileID %2 == 0 ? blackTiles : whiteTiles);
	
	}
		
  }
	
}