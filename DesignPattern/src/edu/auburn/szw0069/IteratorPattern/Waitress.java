package edu.auburn.szw0069.IteratorPattern;

import java.util.Iterator;

public class Waitress {
	DinerMenu dinerMenu;
	PancakeMenu lunchMenu;
	public Waitress(DinerMenu dinerMenu, PancakeMenu lunchMenu){
		this.dinerMenu = dinerMenu;
		this.lunchMenu = lunchMenu;
	}
	
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator lunchIterator = lunchMenu.createIterator();
		System.out.println("the Diner Menu is \n");
		printMenu(dinerIterator);
		System.out.println("the Lunch Menu is \n");
		printMenu(lunchIterator);
	}
	
	public void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItems = (MenuItem)iterator.next();
			System.out.print(menuItems.getName()+", ");
			System.out.print(menuItems.getDescription()+", ");
			System.out.println(menuItems.getPrice()+".");
		}
	}

}
