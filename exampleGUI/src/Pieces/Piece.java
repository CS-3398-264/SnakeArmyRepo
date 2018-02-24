package Pieces;

public class Piece {
	private String imageName;
	private String name;
	private int aliance; 
	private int location; 
	
	public Piece() {
		this.aliance = -1;
		this.name = null;
		this.imageName = null;
		this.location = -1;
	}
	
	public void moveLocation(int tileID) {
		this.location = tileID;
	}
	public int getLocation() {
		return location; 
	}
	public String getName() {
		return name;
	}
	public void setName(String nm) {
		this.name = nm;
	}
	public void setImageName(String iN) {
		this.imageName = iN;
	}
	public void setAlly(int ally) {
		this.aliance = ally;
	}
	public int getAlly() {
		return aliance;
	}
	public String getImageName() {
		return imageName;
	}
	public void setEmpty() {
		this.aliance = -1;
		this.name = null;
		this.imageName = null;
		this.location = -1;		
	}
	public void setTo(Piece q) {
		setAlly(q.getAlly());
		setName(q.getName());
		moveLocation(q.getLocation());
		setImageName(q.getImageName());
	}
    
}
