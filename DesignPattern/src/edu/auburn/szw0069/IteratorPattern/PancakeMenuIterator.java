package edu.auburn.szw0069.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator{
	
	ArrayList<MenuItem> items;
	int position = 0;
	public PancakeMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
