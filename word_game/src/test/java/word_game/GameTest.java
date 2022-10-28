package word_game;

import org.junit.Assert;

import org.junit.Test;

public class GameTest {

	public UserInput ui = new UserInput();
	public Game gm = new Game(ui);
	
	@Test
	public void testOutOfBoundsX() {
		gm.setBounds(10, 10);
		boolean expected = true;
		boolean actual = gm.outOfBounds(11, 0);
		
		Assert.assertEquals("Fail", expected, actual);
		
	}
	
	@Test
	public void testOutOfBoundsY() {
		gm.setBounds(10, 10);
		boolean expected = true;
		boolean actual = gm.outOfBounds(0, 11);
		
		Assert.assertEquals("Fail", expected, actual);
		
	}
	
	
	
}
