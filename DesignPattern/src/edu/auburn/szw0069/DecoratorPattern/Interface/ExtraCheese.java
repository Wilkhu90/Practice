package edu.auburn.szw0069.DecoratorPattern.Interface;

public class ExtraCheese extends PizzaDecorator{
	
	Pizza pizza;
	public ExtraCheese(Pizza pizza){
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " and Extra Cheese.";
	}

	@Override
	public int cost() {
		return pizza.cost() + 3;
	}

}