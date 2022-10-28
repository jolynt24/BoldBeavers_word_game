package word_game;

public class Monster extends GameEntity {
	public Monster() {
		message = "Awr! Bon Appetit!";
	}
	
	public int[] showLocation() {
		return new int[] {X,Y};
	}

}
