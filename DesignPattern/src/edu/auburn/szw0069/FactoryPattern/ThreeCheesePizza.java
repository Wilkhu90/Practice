package edu.auburn.szw0069.FactoryPattern;

public class ThreeCheesePizza extends Pizza{

	@Override
	public String getName() {
		return "Three Cheese Pizza";
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getDough() {
		return "Soft Dough!";
	}

	@Override
	public void setDough(String dough) {
		this.dough = dough;
		
	}

	@Override
	public String getCheese() {
		return "Mozarrela, Parmezan & Rivoli";
	}

	@Override
	public void setCheese(String cheese) {
		this.cheese = cheese;
		
	}

}
