package edu.auburn.szw0069.IteratorPattern;

public class MenutestDrive {
	public static void main(String [] args){
	
		DinerMenu dinerMenu = new DinerMenu();
		PancakeMenu lunchMenu = new PancakeMenu();
		Waitress waitress = new Waitress(dinerMenu, lunchMenu);
		
		waitress.printMenu();
	}
}
