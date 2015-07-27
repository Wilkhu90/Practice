package edu.auburn.szw0069.DecoratorPattern.Interface;

public class MozzarelaAddon extends PizzaDecorator{
	
	Pizza pizza;
	public MozzarelaAddon(Pizza pizza){
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " and Mozzarela.";
	}

	@Override
	public int cost() {
		return pizza.cost() + 2;
	}

}
