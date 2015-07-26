package edu.auburn.szw0069.StrategyPattern;

public interface QuackBehaviour {
	
	public void quack();

}
class Quack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("I can Quack.");
		
	}
	
}
class NoQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("I can't Quack.");
		
	}
	
}