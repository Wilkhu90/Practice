package edu.auburn.szw0069.AbstractFactoryPattern;

public class NYPizzaIngridientsFactory implements PizzaIngredientsFactory{

	@Override
	public Dough createDough() {
		return new ToughDough();
	}

	@Override
	public Cheese createCheese() {
		return new ParmeshanCheese();
	}

}
