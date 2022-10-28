package word_game;

public class Treasure extends GameEntity {
	public Treasure() {
		message = "Take me, it's a get rich scheme!";
	}
	
	public int[] showLocation() {
		return new int[] {X,Y};
	}

}
