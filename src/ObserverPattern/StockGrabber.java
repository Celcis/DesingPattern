package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	
	ArrayList<Observer> observer;
	
	
	public void register(Observer newObserver) {
		
		observer.add(newObserver);
		
		
	}

	@Override
	public void unregister(Observer deleteObserver) {

		int  observerIndex = observer.indexOf(deleteObserver);
		System.out.println("Obsever "+ (observerIndex)+" deleted");
		observer.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}





}
