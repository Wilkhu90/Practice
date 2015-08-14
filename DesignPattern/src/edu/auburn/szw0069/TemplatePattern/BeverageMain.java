package edu.auburn.szw0069.TemplatePattern;

public class BeverageMain {

	public static void main(String[] args) {
		CaffieneBeverage tea = new Tea();
		CaffieneBeverage coffee = new Coffee();
		
		System.out.println("The Tea preparation method.");
		tea.prepareBeverage();
		System.out.println();
		System.out.println("The Coffee preparation method.");
		coffee.prepareBeverage();

	}

}
