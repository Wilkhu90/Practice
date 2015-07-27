package edu.auburn.szw0069.DecoratorPattern;

public class ThreeCheesePizza extends Pizza{

	@Override
	public String getDescription() {
		return "The Pizza is delicious with three Cheese.";
		
	}

	@Override
	public int cost() {
		return 1; 
		
	}

}
