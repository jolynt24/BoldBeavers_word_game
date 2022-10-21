package word_game;

public class Game {

	public int xCord;
	public int yCord;
	public int gridWidth;
	public int gridHeight;
	public int goalX;
	public int goalY;
	
	// FS
	// Method to set bounds for the game grid
	public void setBounds(int boundX, int boundY) {
		this.gridWidth = boundX;
		this.gridHeight = boundY;
	}
	
	// FS
	// Method to check if the new position of the user is out of bounds
	public boolean outOfBounds(int newX, int newY) {
		if (newX < 0 || newX > gridWidth) {
			return true;
		}
		else if (newY < 0 || newY > gridHeight) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// MM
	public void move() {
		System.out.println("CODE ME!");
	}

	// JT
	public void checkGoal() {
		System.out.println("CODE ME!");
	}
	
	// JT
	public void setGoal() {
		System.out.println("CODE ME!");
	}
	
	// MM
	public void updatePos() {
		System.out.println("CODE ME!");
	}
	
	// CR
	public void showResult() {
		System.out.println("CODE ME!");
	}
	
	// FR
	public void quit() {
		System.out.println("CODE ME!");
	}

	// JT
	public void start() {
		System.out.println("CODE ME!");
	}
	
}
