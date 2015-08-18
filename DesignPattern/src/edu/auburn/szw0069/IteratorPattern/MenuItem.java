package edu.auburn.szw0069.IteratorPattern;

public class MenuItem {
	String name;
	String description;
	double price;
	
	public MenuItem(String newName, String newDescription, double newprice){
		name = newName;
		description = newDescription;
		price = newprice;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

}
