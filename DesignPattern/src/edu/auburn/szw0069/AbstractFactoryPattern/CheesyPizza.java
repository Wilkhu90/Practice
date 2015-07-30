package edu.auburn.szw0069.AbstractFactoryPattern;

public class CheesyPizza extends Pizza{

	PizzaIngredientsFactory ingridientsFactory;
	
	public CheesyPizza(PizzaIngredientsFactory ingridientsFactory) {
		this.ingridientsFactory = ingridientsFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing: "+ name);
		dough = ingridientsFactory.createDough();
		cheese = ingridientsFactory.createCheese();
		
	}

}
