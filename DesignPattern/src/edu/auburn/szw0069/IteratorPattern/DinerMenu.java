package edu.auburn.szw0069.IteratorPattern;

import java.util.Iterator;

public class DinerMenu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		additems("DinerItem1", "description 1", 2.99);
		additems("DinerItem2", "description 2", 3.99);
	}

	private void additems(String name, String desc, double price) {
		MenuItem menuItem = new MenuItem(name, desc, price);
		if (numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry!! Items exceed limit.");
		}
		else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
		
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems); 
	}

}
