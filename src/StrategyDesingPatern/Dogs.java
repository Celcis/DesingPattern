package StrategyDesingPatern;

public class Dogs extends Animal {

	public void digHole() {
		System.out.println("Dogs are good");
	}
	
	public Dogs() {
		super();
		setSound("Bark");
		
		//Setting Flys interface polymorphically
		//This sets the behavior as a non-flying Animal
		flyingType = new CantFly();
	}
}
