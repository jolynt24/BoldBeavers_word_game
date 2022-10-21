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
	
	public Scanner userInput;
	
	public Game(Scanner scanner) {
		this.userInput = scanner;
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
			goalY ++;
			break;
		case "A":
			System.out.println("MOVE: LEFT");
			goalX --;
			break;
		case "S":
			System.out.println("MOVE: DOWN");
			goalY --;
			break;
		case "D":
			System.out.println("MOVE: RIGHT");
			goalX ++;
			break;
			
		}
		
		boolean is_valid = true;
		//boolean is_valid = this.checkBounds(goalX, goalY);
		
		if (is_valid == false) {
			
			this.quit();
			
		}
		
	}

	// JT
	public void checkGoal() {
		System.out.println("CODE ME!");
	}
	
	// JT
	public void setGoal() {
		System.out.println("CODE ME!");
	}

	
	// CR
	public void showResult() {
		System.out.println("CODE ME!");
	}
	
	// FR
	public void quit() {
		this.isRunning = false;
	}

	// JT
	public void start() {
		
	}
	
}
