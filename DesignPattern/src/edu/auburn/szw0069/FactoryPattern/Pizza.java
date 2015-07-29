package edu.auburn.szw0069.FactoryPattern;

public abstract class Pizza {
	String name;
	String dough;
	String cheese;
	
	public void prepare(){
		System.out.println("The pizza is " + getName());
		System.out.println("It comes with " + getDough() + " and " + getCheese());
	}
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getDough();
	public abstract void setDough(String dough);
	public abstract String getCheese();
	public abstract void setCheese(String cheese);
	
	public void bake(){
		System.out.println("The Pizza is getting baked.");
	}
	public void cut(){
		System.out.println("The Pizza is getting cut into pieces.");
	}
	public void box(){
		System.out.println("The Pizza is in the box and ready to b delivered.");
	}
}
