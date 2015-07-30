package edu.auburn.szw0069.AbstractFactoryPattern;

public class ChicagoPizzaIngridientsFactory implements PizzaIngredientsFactory{

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

}
