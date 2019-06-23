package StrategyDesingPatern;

public class Runner {

	public static void main(String[] args) {
		
		Animal anigo = new Dogs();
		Animal kiki = new Birds();
		
		System.out.println("Dog: "+anigo.tryToFly());
		System.out.println("Bird: "+ kiki.tryToFly());
	
		anigo.setFlyingAbility(new ItFlys());
		System.out.println("Dog: "+anigo.tryToFly());
	}
}
