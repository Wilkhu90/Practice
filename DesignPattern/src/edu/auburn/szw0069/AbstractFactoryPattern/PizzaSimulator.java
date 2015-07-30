package edu.auburn.szw0069.AbstractFactoryPattern;

public class PizzaSimulator {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("C");
	}
}
