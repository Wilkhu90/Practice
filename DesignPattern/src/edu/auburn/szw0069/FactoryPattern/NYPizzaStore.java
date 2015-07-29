package edu.auburn.szw0069.FactoryPattern;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String option) {
		if(option == "Single"){
			return new CheeseBurstPizza();
		}
		else if(option == "Three"){
			return new ThreeCheesePizza();
		}
		else{
			return null;
		}
	}

}
