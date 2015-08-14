package edu.auburn.szw0069.TemplatePattern;

public class Coffee extends CaffieneBeverage{

	@Override
	public void addBeverage() {
		System.out.println("Adding coffee for brewing.");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and cinamon. The Coffee is Ready!!");
		
	}
}
