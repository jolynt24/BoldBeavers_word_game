package word_game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public int xCord = 0;
	public int yCord = 0;
	public int gridWidth;
	public int gridHeight;
	public int goalX;
	public int goalY;
	
	public ArrayList<GameEntity> entities = new ArrayList<GameEntity>();;
	
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
			checkEntity(xCord, yCord);
			break;
		case "A":
			System.out.println("MOVE: LEFT");
			xCord --;
			checkEntity(xCord, yCord);
			break;
		case "S":
			System.out.println("MOVE: DOWN");
			yCord --;
			checkEntity(xCord, yCord);
			break;
		case "D":
			System.out.println("MOVE: RIGHT");
			xCord ++;
			checkEntity(xCord, yCord);
			break;
		default:
			System.out.println("Invalid move! >:(");
			break;
			
		}
		
		boolean is_valid = true;
		//boolean is_valid = this.checkBounds(goalX, goalY);
		
		if (is_valid == false) {
			
			this.quit();
			
		}
		
	}

	// Adding entities to the collection
	public void addEntity(GameEntity ge) {
		entities.add(ge);
	}
	
	// Checking whether if the player has encountered an entity and printing out appropriate message
	public void checkEntity(int xCord, int yCord) {
		// iterate through the entities and their locations
		for (int i=0; i<entities.size(); i++) {
			if(foundEntity(entities.get(i), xCord, yCord) == true) {
				System.out.println(entities.get(i).getMessage());
				this.quit();
			}
		}
	}
	
	// method to check if the entity has been encountered
	public boolean foundEntity(GameEntity ge, int xCord, int yCord) {
		boolean status = false;
		if(xCord == ge.getLocationX() && yCord == ge.getLocationY()) {
			status = true;
		}
		return status;
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
		System.out.println("Your X cord: " + this.xCord);
		System.out.println("Your Y cord: " + this.yCord);
	}
	
	// FR
	public void quit() {
		System.out.println("GAME OVER");
		System.out.println("Play again? y/n");
		String input = this.userInput.getInput();
		xCord = 0;
		yCord = 0;
		
		switch(input.toUpperCase()) {
		case "Y":
			this.isRunning = true;
			break;
			
		case "N":
			this.isRunning = false;
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		
		/*
		if (input == "y") {
			this.isRunning = true;
			this.start();
		}
		else if (input == "n") {
			this.isRunning = false;
		}*/
		
	}

	// JT
	public void start() {
		System.out.println("WASD to move! :)");
		
		//Start of the game
		System.out.println("======== WELCOME ========");

		while(isRunning) {
			this.showResult();
			System.out.println("Where would you like to move?");

			this.move(this.userInput.getInput());
			if(this.outOfBounds(xCord, yCord)) {
				System.out.println("You are out of bounds!");
				this.quit();
				continue;
			}
		}
	}
	
}
