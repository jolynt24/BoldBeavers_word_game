package word_game;

public class runner {

	public static void main(String[] args) {
		boolean stopPlaying = false;
		
		while (stopPlaying == false) {
			UserInput userInput = new UserInput();
			Game newGame = new Game(userInput);
			
			// Adding entities
			Monster monster = new Monster();
			Treasure treasure = new Treasure();
			
			// Setting attributes
			monster.setLocation(1, 0);
			treasure.setLocation(2, 2);
			newGame.setBounds(5, 5);
			
			// Adding entities to collection
			newGame.addEntity(monster);
			newGame.addEntity(treasure);
			newGame.start();
			
			System.out.println("Play again? Press N to exit or any key to continue");
			
			String input = userInput.getInput().toUpperCase();
			if (input.equals("N")) {
				stopPlaying = true;
				newGame.quit();
				newGame.userInput.scan.close();
				System.exit(0);
			}
			
			
		}

	}

}
