package edu.auburn.szw0069.TemplatePattern;

public abstract class CaffieneBeverage {
	
	public final void prepareBeverage() {
		boilHotWater();
		addBeverage();
		pourInCup();
		addCondiments();
	}

	private final void pourInCup() {
		System.out.println("Now Pouring the beverage in the cup.");
		
	}

	private final void boilHotWater() {
		System.out.println("Boiling the hot water in kettle for the beverage.");
		
	}
	public abstract void addBeverage();
	public abstract void addCondiments();

}
