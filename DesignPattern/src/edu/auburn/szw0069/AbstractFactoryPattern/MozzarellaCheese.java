package edu.auburn.szw0069.AbstractFactoryPattern;

public class MozzarellaCheese extends Cheese{
	public MozzarellaCheese(){
		setCheese();
	}

	@Override
	public void setCheese() {
		cheeseName = "Mozzarella";
		
	}

}
