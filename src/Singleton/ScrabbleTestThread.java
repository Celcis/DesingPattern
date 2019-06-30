package Singleton;

public class ScrabbleTestThread {
	
	
	public static void main(String[] args) {
		
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTileAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTileAgain).start();
	}

}
