package word_game;

public class runner {

	public static void main(String[] args) {
		
		UserInput userInput = new UserInput();
		Game newGame = new Game(userInput);
		newGame.start();
		newGame.userInput.scan.close();
		
		
	}

}
