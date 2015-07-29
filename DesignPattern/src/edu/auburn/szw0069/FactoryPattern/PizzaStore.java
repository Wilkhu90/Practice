package edu.auburn.szw0069.FactoryPattern;

public abstract class PizzaStore {

	Pizza pizza = null;
	public void orderPizza(String option){
		
		pizza = createPizza(option);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	public abstract Pizza createPizza(String option);
}
