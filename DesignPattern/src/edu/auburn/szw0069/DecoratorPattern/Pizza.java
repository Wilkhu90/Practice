package edu.auburn.szw0069.DecoratorPattern;

public abstract class Pizza {
	String description = "Unknown Pizza.";
	
	public String getDescription(){
		return description;
	}
	public abstract int cost();

}
