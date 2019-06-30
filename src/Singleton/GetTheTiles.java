package Singleton;

import java.util.LinkedList;


public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID "+ System.identityHashCode(newInstance));
		
		LinkedList<String> player = newInstance.getLetterList();
		
		System.out.println("Player 2: "+ player);
		System.out.println("Got Tiles ");
		
	}

}
