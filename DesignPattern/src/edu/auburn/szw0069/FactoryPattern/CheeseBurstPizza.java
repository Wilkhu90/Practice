package edu.auburn.szw0069.FactoryPattern;

public class CheeseBurstPizza extends Pizza{

	@Override
	public String getName() {
		return "Cheese Burst Pizza";
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getDough() {
		return "Normal Dough!";
	}

	@Override
	public void setDough(String dough) {
		this.dough = dough;
		
	}

	@Override
	public String getCheese() {
		return "Mozarrela";
	}

	@Override
	public void setCheese(String cheese) {
		this.cheese = cheese;
		
	}

}
