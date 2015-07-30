package edu.auburn.szw0069.AbstractFactoryPattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngridientsFactory();
		
		if (item.equals("C")){
			pizza = new CheesyPizza(ingredientsFactory);
			pizza.setName("New York Cheesy Pizza");
		}
		return pizza;
	}

}
