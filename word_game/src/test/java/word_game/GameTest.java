package word_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	public UserInput ui = new UserInput();
	public Game gm = new Game(ui);
	
	@Test
	public void testOutOfBounds() {
		gm.setBounds(10, 10);
		
	}

}
