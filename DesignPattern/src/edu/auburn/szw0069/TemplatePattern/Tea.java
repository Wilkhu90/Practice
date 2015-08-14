package edu.auburn.szw0069.TemplatePattern;

public class Tea extends CaffieneBeverage{

	@Override
	public void addBeverage() {
		System.out.println("Adding tea for stewing.");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and lemon. The tea is Ready!!");
		
	}

}
