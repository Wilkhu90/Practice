package edu.auburn.szw0069.AbstractFactoryPattern;

public class ToughDough extends Dough{
	public ToughDough(){
		setDough();
	}

	@Override
	public void setDough() {
		doughName = "Tough Dough";
	}

}
