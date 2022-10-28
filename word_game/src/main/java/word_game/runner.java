package word_game;

public class runner {

	public static void main(String[] args) {
		
		UserInput userInput = new UserInput();
		Game newGame = new Game(userInput);
		
		// Adding entities
		Monster monster = new Monster();
		Treasure treasure = new Treasure();
		
		// Setting entity attributes
		monster.setLocation(0, 0);
		treasure.setLocation(2, 2);
		
		// Adding entities to collection
		newGame.addEntity(monster);
		newGame.addEntity(treasure);
		
		// Starting game
		newGame.start();
		newGame.userInput.scan.close();
	}

}
