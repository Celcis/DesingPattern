package StrategyDesingPatern;

public class Birds extends Animal {

	
	public Birds() {
		super();
		setSound("Tweet");
		//setting fly ability as poly
		flyingType = new ItFlys();
	}
}
