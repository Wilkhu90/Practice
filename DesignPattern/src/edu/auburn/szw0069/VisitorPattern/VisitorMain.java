package edu.auburn.szw0069.VisitorPattern;

import java.util.ArrayList;

public class VisitorMain {
	
	public static void main(String [] args){
		
		TaxVisitor taxCalc = new TaxVisitor("#.##");
		
		Liquor liquorItem = new Liquor(3.14);
		Tobacco tobaccoItem = new Tobacco(13.14);
		Necessity necessityItem = new Necessity(20.14);
		
		ArrayList<Visitable> items = new ArrayList<Visitable>();
		items.add(liquorItem);
		items.add(tobaccoItem);
		items.add(necessityItem);
		
		System.out.println("The Tax System in execution...\n");
		for (Visitable item : items){
			System.out.println(item.accept(taxCalc));
		}
	}

}
