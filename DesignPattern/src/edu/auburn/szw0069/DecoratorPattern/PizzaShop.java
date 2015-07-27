package edu.auburn.szw0069.DecoratorPattern;

public class PizzaShop {

	public static void main(String[] args) {
		
		Pizza pizza = new ThreeCheesePizza();
		System.out.println(pizza.getDescription() + " and it's cost is: " + pizza.cost());
		pizza = new MozzarelaAddon(new FlatDough());
		
		System.out.println(pizza.getDescription() + " and it's cost is: " + pizza.cost());
		
		Pizza pizza2 = new MozzarelaAddon(new MozzarelaAddon(new FlatDough()));
		System.out.println(pizza2.getDescription() + " and it's cost is: " + pizza2.cost());
		

	}

}
