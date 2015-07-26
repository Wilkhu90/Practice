package edu.auburn.szw0069.StrategyPattern;

public interface FlyBehaviour {
	
	public void fly();
}

class Fly implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I can Fly.");
		
	}
	
}
class NoFly implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I can't Fly.");
		
	}
	
}