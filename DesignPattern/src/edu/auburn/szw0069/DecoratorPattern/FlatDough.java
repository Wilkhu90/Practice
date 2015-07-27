package edu.auburn.szw0069.DecoratorPattern;

public class FlatDough extends Pizza{

	@Override
	public String getDescription() {
		return "The Pizza is delicious with a Flat Dough.";
		
	}

	@Override
	public int cost() {
		return 2; 
		
	}

}