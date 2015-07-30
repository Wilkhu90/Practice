package edu.auburn.szw0069.AbstractFactoryPattern;

public class ParmeshanCheese extends Cheese{
	public ParmeshanCheese(){
		setCheese();
	}

	@Override
	public void setCheese() {
		cheeseName = "Parmeshan";
		
	}

}
