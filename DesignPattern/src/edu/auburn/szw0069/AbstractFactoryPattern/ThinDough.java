package edu.auburn.szw0069.AbstractFactoryPattern;

public class ThinDough extends Dough{
	public ThinDough(){
		setDough();
	}

	@Override
	public void setDough() {
		doughName = "Thin Dough";
	}

}
