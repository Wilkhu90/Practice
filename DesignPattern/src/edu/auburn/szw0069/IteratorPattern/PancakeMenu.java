package edu.auburn.szw0069.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeMenu() {
		
		menuItems = new ArrayList<MenuItem>();
		
		additems("PancakeItem1", "description 1", 2.99);
		additems("PancakeItem2", "description 2", 3.99);
	}

	private void additems(String name, String desc, double price) {
		MenuItem menuItem = new MenuItem(name, desc, price);
		menuItems.add(menuItem);
		
	}

	public Iterator createIterator(){
		return new PancakeMenuIterator(menuItems); 
	}

}
