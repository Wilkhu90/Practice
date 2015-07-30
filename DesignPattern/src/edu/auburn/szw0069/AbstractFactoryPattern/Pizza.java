package edu.auburn.szw0069.AbstractFactoryPattern;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	
	public abstract void prepare();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
