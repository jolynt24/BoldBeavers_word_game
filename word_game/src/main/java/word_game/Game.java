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
	public void setBounds() {
		System.out.println("CODE ME!");
	}	
	
	// FS
	public void checkBounds() {
		System.out.println("CODE ME!");
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
		System.out.println("CODE ME!");
	}

	// JT
	public void start() {
		
		
	}
	
}
