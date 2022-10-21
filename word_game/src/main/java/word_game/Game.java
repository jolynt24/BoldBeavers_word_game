package word_game;

import java.util.Scanner;

public class Game {

	public int xCord = 0;
	public int yCord = 0;
	public int gridWidth;
	public int gridHeight;
	public int goalX;
	public int goalY;
	
	public boolean isRunning = true;
	
	public UserInput userInput;
	
	public Game(UserInput userInput2) {
		this.userInput = userInput2;
	}
	
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
	public void move(String user_input) {
		
		switch (user_input.toUpperCase()) {
		
		case "W":
			System.out.println("MOVE: UP");
			yCord ++;
			break;
		case "A":
			System.out.println("MOVE: LEFT");
			xCord --;
			break;
		case "S":
			System.out.println("MOVE: DOWN");
			yCord --;
			break;
		case "D":
			System.out.println("MOVE: RIGHT");
			xCord ++;
			break;
			
		}
		
		boolean is_valid = true;
		//boolean is_valid = this.checkBounds(goalX, goalY);
		
		if (is_valid == false) {
			
			this.quit();
			
		}
		
	}

	// JT
	public boolean checkGoal(int userX, int userY) {
		// Checks if the user coordinates are the same as the goal coordinates
		// Inputs: X and Y coordinates of the user
		// Output: Returns true if the user coordinates = goal coordinates, otherwise false
		
		if(userX==goalX && userY==goalY) return true;
		return false;	
	}
	
	// JT
	public void setGoal(int goalX, int goalY) { //hard-coded for demo
		// Sets random goal coordinates in the grid
		// Inputs: Takes the instance values of 'gridWidth' and 'gridHeight'
		// Output: Returns random values of goalX and goalY within the range of 0 - gridWidth and 0 - gridHeight
		
		/*Random r = new Random();
		this.goalX = r.nextInt(0) + gridWidth;
		this.goalY = r.nextInt(0) + gridHeight;*/
		
		this.goalX = goalX;
		this.goalY = goalY;
	}

	
	// CR
	public void showResult() {
		System.out.println(this.xCord);
		System.out.println(this.yCord);
	}
	
	// FR
	public void quit() {
		this.isRunning = false;
	}

	// JT
	public void start() {
		//Start of the game
		System.out.println("======== WELCOME ========");
		this.setGoal(2, 3); //hard-coded
		this.setBounds(4, 4); //hard-coded
		System.out.println("Your current position: (0,0)");
		while(isRunning) {
			System.out.println("Where would you like to move?");
			UserInput in = new UserInput();
			this.move(in.toString());
			if(this.outOfBounds(xCord, yCord)) {
				System.out.println("You are out of bounds! GAME OVER :(");
				this.quit();
				continue;
				
			}
			if(this.checkGoal(xCord, yCord)) {
				System.out.println("FINALLY, you found the goal :)");
				this.showResult();
				this.quit();
				continue;
			}
		}
		
		
	}
	
}
