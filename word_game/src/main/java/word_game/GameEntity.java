package word_game;

public class GameEntity {

	public int locationX;
	public int locationY;
	public String message;
	
	
	
	
	// method to get location
	
	public int getLocationX() {
		return locationX;
	}
	
	public int getLocationY() {
		return locationY;
	}
	
	// method to set location
	public void setLocation(int x, int y) {
		
		this.locationX = x;
		this.locationY = y;
		
	}
	
	// method to get message
	
	public String getMessage() {
		return message;
		
	}
	
	//method to set message
	public void setMessage(String message) {
		
		this.message = message;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
